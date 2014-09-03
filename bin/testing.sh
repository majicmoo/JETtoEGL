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
