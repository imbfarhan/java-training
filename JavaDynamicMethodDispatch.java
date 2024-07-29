class Phone{
    public void info()
    {
        System.out.println("This is a PHONE");
    }

    public void call()
    {
        System.out.println("Calling from PHONE");
    }

    public void on()
    {
        System.out.println("Turning on PHONE");
    }

}

class SmartPhone extends Phone
{
    @Override
    public void on()
    {
        System.out.println("Turning on SMARTPHONE");
    }

    @Override
    public void call()
    {
        System.out.println("Calling from SMARTPHONE");
    }

    public void playMusic()
    {
        System.out.println("Playing music from SMARTPHONE");
    }
}



public class JavaDynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p = new Phone(); //Allowed
        SmartPhone sp = new SmartPhone(); // Allowed

        /* DYNAMIC METHOD DISPATCH */
        // Useful for runtime polymorphism
        // Superclass reference = subclass object.
        Phone testP = new SmartPhone(); //A smartphone is a phone. Allowed.
        // SmartPhone testSP = new Phone(); //Not Allowed. Will give error.
        testP.info(); //info() method of phone will be called.
        testP.on(); //on() method of smartphone will be called.
        testP.call(); //call() method of smartphone will be called.

        //In dynamic dispatch method, we can use all those methods that are present in the superclass reference. Note that we cannot use methods that are specific to the subclass.
        // testP.playMusic(); //This method will give error.


    }
}
