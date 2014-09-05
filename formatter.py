import os
import glob

def formatter(filename):
    file_origin = open(fname, "r")
    edit_fname = "bin/temp.txt"
    file_destination = open(edit_fname, "w")
    
    file_lines = file_origin.readlines()
    line_count = 0
    
    # If true skip line as it must be removed
    skip = False
    for line in file_lines:
        if not skip:
            # Remove tabs 
            line = line.lstrip()
            
            # Remove extra whitespace
            if "[%" in line:
                line = line.replace("  ","")
                line = line.replace("\t","")
            
            ## move "%]" up
            if line_count != len(file_lines)-1:
                next_line = file_lines[line_count+1].lstrip().replace("\n", "")
                if "%]" in next_line:
                    if "[%" in next_line:
                        next_line = next_line.replace("  ","")
                        next_line = next_line.replace("\t","")
                    
                    if "[%import" in line or "[%include" in line:
                        file_destination.write(line)
                    else:
                        file_destination.write(line.replace("\n", "")+next_line+"\n")
                        skip = True
                else:
                    file_destination.write(line)
            else:
                file_destination.write(line)
        else:
            skip = False 
        line_count += 1
    
    file_origin.close()
    file_destination.close()
    
    file_origin = open(edit_fname, "r")
    file_destination = open(fname, "w")
    
    file_lines = file_origin.readlines()
    
    line_count = 0
    skip = False
    ## Move leftover %] up
    for line in file_lines:
        if not skip:
            if line == "[%;} %]\n":
                file_destination.write("[%} %]\n")
            elif line == "};\n":
                file_destination.write("}\n")    
            else:
                if line_count != len(file_lines)-1:
                    next_line = file_lines[line_count+1]
                    if "%]" in next_line:
                        if next_line[0] == "%" or next_line[1] == "]":
                            file_destination.write(line.replace("\n", "")+next_line)
                            skip = True
                        else:
                            file_destination.write(line)
                    else:
                        file_destination.write(line)
                else:
                    file_destination.write(line)
        else:
            skip = False 
        line_count += 1    
                
    file_origin.close()
    file_destination.close()
    ##os.rename("temp.txt", filename)
    
 

path = "egl/*"
files = glob.glob(path)
#print files
for fname in files:
    formatter(fname)
    print "Formatting", fname
    
        
    
    
