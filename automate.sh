echo 'Generating Lexer and Parser'
java -jar /usr/local/lib/antlr-4.5.3-complete.jar newton.g4 -o src/ -listener -no-visitor -long-messages -Werror
cd src/
javac Renderer.java -d ../gen
echo 'Compiling Renderer'
cd ../gen/

if [ $1 == 'build' ]
then
    echo 'Running Renderer'
    echo '-----'
    java Renderer ../example/example.newton
elif [ $1 == 'ast' ]
then
    echo 'Running TestRig...'
    java org.antlr.v4.gui.TestRig newton file -gui ../example/example.newton
elif [ $1 == 'token' ]
then
    echo 'Running TestRig...'
    java org.antlr.v4.gui.TestRig newton file -tokens ../example/example.newton
elif [ $1 == 'trace' ]
then
    echo 'Running TestRig...'
    java org.antlr.v4.gui.TestRig newton file -trace ../example/example.newton
elif [ $1 == 'diagnostics' ]
then
    echo 'Running TestRig...'
    java org.antlr.v4.gui.TestRig newton file -diagnostics ../example/example.newton
else
    echo 'Enter build / ast / token / trace / diagnostics '
fi
