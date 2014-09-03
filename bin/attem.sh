echo "Testing"
echo "Compiling"
javac -cp packages/*:packages/src:. TempJetTest.java
echo "Running"
java -cp packages/*:. TempJetTest

