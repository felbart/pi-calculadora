@echo off
mkdir bin 2>nul
javac -cp lib\junit-platform-console-standalone-1.10.0.jar -d bin src\main\java\Calc.java src\test\java\CalcTest.java
echo Compilação concluída.
pause