import os
import subprocess
import glob

def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]

path = "java/*"
eolpath = "eol/"
files = glob.glob(path)
## Runs txl transformations in terminal
print "Transforming Java to EOL"
for fname in files:
    call = "txl -comment "+"./"+fname +" -o "+ "./"+eolpath+cleanFileName(fname)+".eol"
    subprocess.call(call, shell=True)

