echo 'Generating Lexer and Parser'
java -jar /usr/local/lib/antlr-4.5.3-complete.jar newton.g4 -o src/ -listener -no-visitor
cd src/
javac Renderer.java -d ../gen
echo 'Compiling Renderer'
cd ../gen/
echo 'Running Renderer'
echo '-----'
java Renderer ../testing/test.newton