echo "Testing"
echo "Compiling"
javac -cp packages/*:. Testing.java
echo "Running"
java -cp packages/*:src:. Testing


echo " "
echo "Compiling"
javac -cp packages/*:src:. JetTest.java
echo "Running"
java -cp packages/*:src:. JetTest

echo " "
echo "Comparing"
wdiff ./compare/jet.txt ./compare/egl.txt >/dev/null;REPLY=$?
if [ ${REPLY} -eq 0 ]
then
         echo "Files are identical"
else
         echo "Files are different"
fi
