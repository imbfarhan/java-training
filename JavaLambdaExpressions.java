@FunctionalInterface
interface FuncInterface{
    void additionMethod(int a,int b);
}


public class JavaLambdaExpressions {
    public static void main(String[] args) {
        System.out.println();

        //Instead of creating a seperate class which implements FuncInterface, then defining the method there, then creating object, we can use lambda expression.

        //FunctionalInterface has only one method which has to be implemented, this is a concise way to do this.
        FuncInterface func1 = (a,b) -> {System.out.println(a+" + "+b+" = "+Integer.valueOf(a+b));};
        func1.additionMethod(5, 6);
    }
}
