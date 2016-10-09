echo 'Generating Lexer and Parser'
antlr4 newton.g4 -o src
cd src/
javac Renderer.java -d ../gen
echo 'Compiling Renderer'
cd ../gen/
echo 'Running Renderer'
echo '-----'
java Renderer ../testing/test.newton