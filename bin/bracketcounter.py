
def count(fname):
    fname = fname.readlines()
    
    
    left_bracket = 0
    right_bracket = 0
    for line in fname:
        for i in line:
            if i == "{":
                left_bracket += 1
            elif i == "}":
                right_bracket += 1
    print "Left Count = " + str(left_bracket)
    print "Right Count = " + str(right_bracket)+ "\n"

def countJet(fname):
    inDynamic = False
    left_bracket = 0
    right_bracket = 0
    fname = fname.readlines()
    
    
    for line in fname:
        count = 0
        temp = False
        for char in line:
            if inDynamic == False:
                if temp == True:
                    temp = False
                    if (char == "%"):
                        inDynamic = True
                else:
                    if char == "<":
                        temp = True
                    
                        
            else:
                if temp == True:
                    temp = False
                    if (char == ">"):
                        inDynamic = False
                    else:
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                else:
                    if char == "%":
                        temp = True
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                    else:
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
            count += 1
    print "Left Count = " + str(left_bracket)
    print "Right Count = " + str(right_bracket)+ "\n"


def countJava(fname):
    inComment = False
    left_bracket = -2
    right_bracket = -2
    fname = fname.readlines()
    
    
    for line in fname:
        if not line.startswith("//"):
            count = 0
            temp = False
            for char in line:
                if inComment == False:
                    if temp == True:
                        temp = False
                        if (char == "*"):
                            inComment = True
                        else:
                            left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                    else:
                        if char == "/":
                            temp = True
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                        
                            
                else:
                    if temp == True:
                        temp = False
                        if (char == "/"):
                            inComment = False
                    else:
                        if char == "*":
                            temp = True
                count += 1
    print "Left Count = " + str(left_bracket)
    print "Right Count = " + str(right_bracket)+ "\n"


def countEgl(fname):
    inDynamic = False
    left_bracket = 0
    right_bracket = 0
    fname = fname.readlines()
    
    
    for line in fname:
        count = 0
        temp = False
        for char in line:
            if inDynamic == False:
                if temp == True:
                    temp = False
                    if (char == "%"):
                        inDynamic = True
                else:
                    if char == "[":
                        temp = True
                    
                        
            else:
                if temp == True:
                    temp = False
                    if (char == "]"):
                        inDynamic = False
                    else:
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                else:
                    if char == "%":
                        temp = True
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
                    else:
                        left_bracket, right_bracket = checkBrackets(char, left_bracket, right_bracket)
            count += 1
    print "Left Count = " + str(left_bracket)
    print "Right Count = " + str(right_bracket)+ "\n"


def checkBrackets(i, left_bracket, right_bracket):
    if i == "{":
        left_bracket += 1
    elif i == "}":
        right_bracket += 1
    return left_bracket, right_bracket
    

packageclassjavajet = open("jet/PackageClass.javajet", "r")
packageclassjava = open("java/PackageClass.java", "r")
classjavajet = open("jet/Class.javajet", "r")
classjava = open("java/Class.java", "r")
print "\nPackageClass.javajet"
countJet(packageclassjavajet)
print "PackageClass.java"
countJava(packageclassjava)
print "Advisor JEt"
countJet(open("jet/Advisor.javajet", "r"))
print "Advisor EGL"
countEgl(open("egl/Advisor.egl", "r"))


print "Class.javajet"
countJet(classjavajet)
print ("Class.java")
countJava(classjava)
print ("PackageClassTemp")
countJava(open("java/PackageClasstemp.java", "r"))
print ("ClassTemp")
countJava(open("java/Classtemp.java", "r"))

