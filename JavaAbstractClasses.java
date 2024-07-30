//Abstract -> something that exists only in thought
//Abstract Method -> A method that has ONLY DECLARATION and NO IMPLEMENTATION
//Abstract Class -> Class that contains abstract methods, then the class itself must be declared abstract
//Even one abstract method is enough to make the class abstract
//It is possible to create reference of an abstract class
//IMPORTANT: We cannot create objects of the abstract class

abstract class AbstractParent{
    AbstractParent()
    {
        System.out.println("Abstract Parent constructor");
    }
    void sayHello()
    {
        System.out.println("Abstract Parent Hello");
    }
    abstract void greet();

}

//Once we inherit an abstract class, we will have to implement all its methods, else the inherited class will become an abstract class
class AbstractParentsChild extends AbstractParent{
    AbstractParentsChild()
    {
        System.out.println("Abstract Parent's Child constructor");
    }

    @Override
    void greet()
    {
        System.out.println("Greet method implemented in AbstractParentsChild");
    }
}

//If we dont implement the method, child becomes abstract

abstract class AnotherAbstractChild extends AbstractParent
{
    void AnotherAbstractMethod()
    {
        System.out.println("A method from another abstract child");
    }
}

public class JavaAbstractClasses {
    public static void main(String[] args) {
        AbstractParentsChild abstractChild = new AbstractParentsChild();
        abstractChild.greet();
        System.out.println();
        
        //We can create reference of abstract parent using Dynamic Dispatch
        AbstractParent abstractParent = new AbstractParentsChild();
        abstractParent.greet();
    }
}
