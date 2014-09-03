import os
import glob


def main(fname):
    imports = []    # List to store imports
    includes = set() # Set to store includes
    inDynamic = False
    startStatic = 0
    edit_fname = "bin/temp.txt"
    
    file_origin = open(fname, "r") # File translating from
    file_edit = open(edit_fname, "w") # File used to store work in between
    path = "java"
    file_destination = open(os.path.join(path, cleanFileName(fname)+".java"), "w")  # File translating to
    
    ## file used to store parts of jet 
    ## that have to be translated but do 
    ## not fit java syntax. This will be 
    ## refered to as equals issue.
    ## eg. <%==genClass.isModelRoot() ? genModel.getImportedName("junit.framework.TestCase") : genClass.getClassExtendsGenClass().getImportedTestCaseClassName()%>
    file_store = open(os.path.join(path, cleanFileName(fname)+"temp.java"), "w")
    
    
    ##Used to comment out static parts of Jet
    staticSymbol = "//&&&staticSymbol&&&"
    
    ## Used to help indentify stored code in file_store 
    ## (equals issue)
    storeSymbol = "*%%storeSymbol%%*"
    
    ## loop through jet file
    ##  1. Look for imports and store in a list
    ##  2. Look for includes and store in a list
    ##  3. Comment out static parts of Jet with staticSymbol 
    ##  and save changes to temporary file
    for line in file_origin:
        imports = findImports(line, imports)
        includes = findIncludes(line, includes)
        inDynamic = commentStatic(line, file_edit, inDynamic, staticSymbol)
          
    ## write main class to allow java transformation to work
    writeToFile(file_destination, "class "+cleanFileName(fname)+ " {\n")
    writeToFile(file_destination, "public static void main (String[] args) {\n")
   
    
    ## write imports to destination
    for i in imports:
        writeToFile(file_destination, staticSymbol+ "<%import " + i + ";%>\n")
    
    ## write includes to destination
    for i in includes:
        writeToFile(file_destination, staticSymbol+ "<%include(\""+i+"\");%>\n")
    
    file_edit.close()
    file_edit = open(edit_fname, "r")
    countStore = 0

    ## write dynamic code
    for line in file_edit:
        ##Deal with runnable()
        if "new Runnable()" in line and staticSymbol not in line :
            line = line.replace("new Runnable() { public void run() {", "")
            writeToFile(file_destination, line)
        
        elif "}}.run();" in line:
            line = line.replace("}.run();", "")
            writeToFile(file_destination, line)
        else:
            if "=" in line:
                if line.index('=') == 0:
                    if "?" in line:
                    ## Equals issue
                    ## Store line in seperate file
                        if countStore == 0:
                            writeToFile(file_store, "class "+cleanFileName(fname+"temp")+ " {\n")
                            writeToFile(file_store, "public static void main (String[] args) {\n")
                        writeToFile(file_store, line[1:].rstrip('\n')+";"+"\n")
                        writeToFile(file_destination, staticSymbol+storeSymbol+str(countStore)+"\n")
                        countStore+= 1
                    else:
                        writeToFile( file_destination, staticSymbol+line)
                else:
                    writeToFile( file_destination, line)
            elif "@" in line:
                ## annotations are commented out
                if line.index("@") == 0:
                    writeToFile( file_destination, staticSymbol+line)
                else:
                    writeToFile( file_destination, line)
            else:
                writeToFile( file_destination, line)
    
    #close main funciton
    writeToFile(file_destination, "\n}\n}")
    if countStore > 0:
        #close main function for equals issue file
        writeToFile(file_store, "\n}\n}")
    file_origin.close()
    file_edit.close()
    file_destination.close()  
    file_store.close()
    
    ## Delete empty file
    temp_file = os.path.join(path, cleanFileName(fname)+"temp.java")
    if os.stat(temp_file).st_size == 0:
        os.remove(temp_file)
    
    
        
def commentStatic(line, filename, inDynamic, staticSymbol):
    count = 0
    ##returns if an import statement
    if "import" in line:
    
        ## Rubbishy way of dealing with the word import in comments
        temp_line = line.split("/*")
        if len(temp_line) <= 1:
            commentSplit = line.split("//")
            if len(commentSplit) <= 1:
                return inDynamic
            if "import" in commentSplit[0]: 
                return inDynamic
        if "import" in temp_line[0]:
            return inDynamic
        
    ##returns if an include statement   
    if "@ include" in line:
    ## Rubbishy way of dealing with the word include in comments
        temp_line = line.split("/*")
        if len(temp_line) <= 1:
            commentSplit = line.split("//")
            if len(commentSplit) <= 1:
                return inDynamic
            if "include" in commentSplit[0]: 
                return inDynamic
        if "include" in temp_line[0]:
            return inDynamic

    temp = False
    for char in line:
        if inDynamic == False:
            if count == 0:
                writeToFile(filename, staticSymbol)
            if temp == True:
                temp = False
                if (char == "%"):
                    inDynamic = True
                    writeToFile(filename, char)
                    writeToFile(filename, "\n")
                else:
                    writeToFile(filename, char)
            else:
                if char == "<":
                    temp = True
                writeToFile(filename, char)
                
                    
        else:
            if temp == True:
                temp = False
                if (char == ">"):
                    inDynamic = False
                    writeToFile(filename, "\n" +staticSymbol+"%>")
                else:
                    writeToFile(filename, "%"+char)
            else:
                if char == "%":
                    temp = True
                else:
                    writeToFile(filename, char)
        count += 1
    return inDynamic
        

def findImports(line, imports):
    if "imports" in line:
        a = line.split("\"")
        temp = a[a.index(" imports=")+1].split()
        for i in temp:
            imports.append(clean(i))
    return imports
            


def findIncludes(line, includes):
    if "@ include" in line:
        temp = line.split()
        for i in temp:
            if "file" in i:
                a = i.split("=")
                includes.add(clean(a[1]))
    return includes

   
def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

def writeToFile(file_to, string):
    file_to.write(string)

def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]

path = "jet/*"
files = glob.glob(path)
print "************************"
for fname in files:
    print "Transforming", fname, "from JET -> Java"
    main(fname)   
print "************************"
