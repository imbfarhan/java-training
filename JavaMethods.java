public class JavaMethods {
    
    //Static method (Method of class)
    static void staticMethod(int a, int b)
    {
        int result = a+b;
        System.out.println("STATIC METHOD: a+b="+result);
    }

    void objectMethod(int a,int b)
    {
        int result = a+b;
        System.out.println("OBJECT METHOD: a+b="+result);
    }

    public static void main(String[] args) {
        //Running static method
        JavaMethods.staticMethod(1, 2);
        
        //Running class method
        JavaMethods m = new JavaMethods();
        m.objectMethod(2, 3);
    }
}
