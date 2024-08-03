import tools.Calculator;
import others.OtherMain;
import others.abc.*;
// The symbol '*' in import specifies import all the FILES and not the folder.

public class JavaMainPackageFile{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        ABCProgram abc = new ABCProgram();
        OtherMain ot = new OtherMain();

        System.out.println(calc.addition(1,2,3,4));
        System.out.println(calc.subtraction(5,4));

        abc.abcProgramHello();
        ot.otherMainHello();
    }
}