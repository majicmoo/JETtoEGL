## Search a directory and find jet files and copy them to jet file

import os
import glob
import subprocess

def test(directory, destination):
    fmatches = []
    for root, dirnames, files in os.walk(directory):
        for fname in files:
            if isJet(fname):
                call = "cp "+ os.path.join(root, fname) + " " + destination
                print call
                subprocess.call(call, shell=True)
            

def isJet(fname):
    if "." in fname:
        fname = fname.split(".")[1]
        if fname[-3:] == "jet":
            return True
        else:
            return False          
    else:
        return False
        


## Replace path with the path to your directory
path = "/usr/userfs/m/mep513/Documents/emf"
destination = "jet"
test(path, destination)


