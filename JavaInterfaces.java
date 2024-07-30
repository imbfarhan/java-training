//Interface -> Has all abstract methods
//In Java, Interface is a group of related methods with empty bodies
//We CANNOT create OBJECT of interface
//We CAN create REFERENCES of interface

//All methods in interface are abstract
//Interfaces can be used for multiple inheritance
//Interface methods and fields are PUBLIC by default

/*-- Multiple inheritance is not supported in Java --
REASON: Mostly due to the problem of superclasses having same method name
Indirectly, it is allowed using interfaces
A class can extend another class an implement an interface
*/

interface Bicycle{
    int tyres = 2;
    void slowDown(int decrement);
    void speedUp(int increment);
}

interface BicycleAccessories{
    void blowHorn();
}

//An interface can extend multiple interfaces
interface TestInterface extends Bicycle,BicycleAccessories
{
    void testMethod();
}

//If we implement an interface and dont define its methods, we have to make the class abstract
abstract class AvonBicycle implements Bicycle{
    void dummyMethod()
    {
        System.out.println("This is a DUMMY method");
    }
}


//Here we define the methods of the implemented interface
class HerculesBicycle implements Bicycle,BicycleAccessories{
    HerculesBicycle()
    {
        System.out.println("Hercules Bicycle Created");
    }

    void herculesKilometers()
    {
        System.out.println("This method displays the kilometeres covered by the bike");
    }
    
    //Implemented methods of an interface has to be made public. Reducing visibility of interface method is not allowed
    public void slowDown(int decrement)
    {
        System.out.println("Decremented speed by "+decrement+" units");
    }

    public void speedUp(int increment)
    {
        System.out.println("Increased speed by "+increment+" units");
    }

    public void blowHorn()
    {
        System.out.println("Horn pressed");
    }


}




public class JavaInterfaces {
    public static void main(String[] args) {
        HerculesBicycle hercules = new HerculesBicycle();
        hercules.speedUp(10);
        hercules.slowDown(2);
        hercules.blowHorn();
        hercules.herculesKilometers();

        //We CANNOT modify the fields of an interface as they are FINAL
        // hercules.tyres=10;

        System.out.println();
        //Creating a reference of Bicycle Accessories
        BicycleAccessories onlyHerculesAccessories = new HerculesBicycle();
        onlyHerculesAccessories.blowHorn();


    }
}






