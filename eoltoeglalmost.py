import glob
import os
import re

def main(fname):

    ##Used to comment out static parts of Jet
    staticSymbol = "//&&&staticSymbol&&&"
    
    ## Used to help indentify stored code in file_store
    storeSymbol = "*%%storeSymbol%%*"    
    edit_fname = "bin/temp.txt"
    
    file_origin = open(fname, "r")
    file_edit = open(edit_fname, "w")
    
    path = "egl"
    eolPath = "eol"
    file_destination = open(os.path.join(path, cleanFileName(fname)+".egl"), "w")
    
    
    ## Check if fnametemp exists, 
    ## if it does insert it into fname and remove comments.
    max_line = 0
    if os.path.isfile(os.path.join(eolPath, cleanFileName(fname)+"temp.eol")):
    
        ## open fnametemp (file_store)
        file_store = open(os.path.join(eolPath, cleanFileName(fname)+"temp.eol"), "r")
        
        ## open a file to write edits to fname temp to
        ## called file_store_edit
        file_store_fname = "bin/tempStore.txt"
        file_store_edit= open (file_store_fname, "w")
        
        ## remove semicolons left from java transformation
        ## save changes to file_store_edit
        maxLine = sum(1 for line in file_store if line.rstrip('\n'))
        
        file_store.close()
        file_store = open(os.path.join(eolPath, cleanFileName(fname)+"temp.eol"), "r")
        
        ## 
        removeSemiColons(file_store, file_store_edit, maxLine)
        
        file_store.close()
        file_store_edit.close()
        
        ##maxLine = sum(1 for line in file_origin if line.rstrip('\n'))
        
        ## Read original file and remove comments
        ## Insert equals parts in
        file_store_edit= open(file_store_fname, "r")
        storedLines=file_store_edit.readlines()
        
        
        
        for line in file_origin:
            if line != "\n":
                if staticSymbol in line:
                    if storeSymbol in line:
                        lineTemp = line.replace(staticSymbol, "")
                        lineTemp = lineTemp.replace(storeSymbol, "")
                        ## write to file removing whiteSPACE
                          
                        writeToFile(file_edit, "="+re.sub( '\s+',' ', storedLines[int(clean(lineTemp))]).strip()+"%>")
                    else:
                        writeToFile(file_edit, line.replace(staticSymbol, ""))
                else:
                    writeToFile(file_edit, line) 
                max_line += 1
        
              
    else:
        ## remove comments
        
        for line in file_origin:
            if line != "\n":
                if staticSymbol in line:
                    writeToFile(file_edit, line.replace(staticSymbol, ""))
                else:
                    writeToFile(file_edit, line)
                max_line += 1            
    file_edit.close()
    file_edit = open(edit_fname, "r")
    ##print max_line
    line_count=0
    ## change brackets
    for line in file_edit:
        if line != "\n" :
            if (line_count!=0) and (line_count !=1) and (line_count != max_line-2) and (line_count != max_line-1):
                temp = line.replace("%>", "%]")
                temp = temp.replace("<%\n", "[%")
                writeToFile(file_destination, temp.replace("<%", "[%"))
            line_count += 1
      
        
    file_origin.close()
    file_edit.close()
    file_destination.close()  
           

def writeToFile(filename, string):
    filename.write(string)
    
def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]

def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

def removeSemiColons(file_origin, file_destination, maxLine):
    lineCount = 0
    for line in file_origin:
        if line != "\n":
            if (lineCount!=0) and (lineCount !=1) and (lineCount != maxLine-2) and (lineCount != maxLine-1):
                writeToFile(file_destination, line)
            lineCount += 1

path = "eol/*"
files = glob.glob(path)
#print files
for fname in files:
    if "temp" not in cleanFileName(fname):
        print "Transforming", fname, "from EOL -> EGL"
        main(fname)
        
    else:
        if cleanFileName(fname)[-4:] != "temp":
            main(fname)
