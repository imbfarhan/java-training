class BaseClass{
    int baseNum;
    BaseClass()
    {
        this.baseNum=1;
    }
    BaseClass(int n)
    {
        this.baseNum=n;
    }
}

class DerivedClass extends BaseClass{
    int derivedNum;
    DerivedClass()
    {
        //If we dont specify super, default constructor of parent will be called
        this.derivedNum=1;
    }
    DerivedClass(int derived)
    {
        //If we dont specify super, default constructor of parent will be called
        this.derivedNum = derived;
    }
    DerivedClass(int base,int derived)
    {
        //Here we specify super so paramterized constructor of parent is called
        super(base);
        this.derivedNum=derived;
    }
}

class DerivedDerivedClass extends DerivedClass
{
    int derivedDerivedNum;
    DerivedDerivedClass()
    {
        this.derivedDerivedNum=2;
    }
    DerivedDerivedClass(int base,int derived,int derivedderived)
    {
        super(base,derived);
        this.derivedDerivedNum=derivedderived;
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        DerivedClass d1 = new DerivedClass();
        DerivedClass d2 = new DerivedClass(10,20);
        DerivedClass d3 = new DerivedClass(30);
        DerivedDerivedClass dd1 = new DerivedDerivedClass(100,200,300);
        System.out.println(d1.baseNum);
        System.out.println(d2.baseNum);
        System.out.println(d3.baseNum);
        System.out.println(dd1.baseNum);

    }
}
