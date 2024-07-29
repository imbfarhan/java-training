class ClassOne{
    int classOneInteger;
    ClassOne()
    {
        this.classOneInteger=1;
    }
    public void method1()
    {
        System.out.println("This is method1 of ClassOne");
    }
}

class ClassTwo extends ClassOne{
    int classTwoInteger;
    ClassTwo()
    {
        this.classTwoInteger = 2;
    }

    @Override //Use this type annotation if you are overriding a method from the parent class. Lateron if name/params of the method 'method1()' is changed in the parent class, you wont have a problem.
    public void method1()
    {
        System.out.println("This is method2 of ClassTwo");
    }

    //Method Overloading
    public void method2()
    {
        System.out.println("Method2 NO PARAMS overloading example");
    }
    
    public void method2(String s)
    {
        System.out.println("Method2 ONE PARAM overloading example");
    }
}


public class JavaMethodOverriding {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        c1.method1();
        c2.method1();
        c2.method2();
        c2.method2("Single Param");
    
    }
}
