
//We can have private method definitions in an interface which can be used in default methods. This private method cannot be accessed directly byu the object
interface Camera{
    void takePicture();
    void recordVideo();
    private void greetUser()
    {
        System.out.println("Hello User");
    }

    /*Default method

    This allows us to ensure backward compatibility. Introduced in Java 8
    Suppose there are 100 classess that implement MyCamera interface. Later, if we add a method recordHDVideo in MyCamera, we will have to implement it in all child classses. To solve this problem, we can use the default method in interface

    This allows us to update the interface
    We dont have to provide implementation for a default method in the classess that implement this interface
    */

    default void recordHDVideo()
    {
        greetUser();
        System.out.println("Recording HD Video");
    }
}

interface Wifi{
    String[] getAvailableNetworks();
    void connectToNetwork(String networkName);
}

class CellPhone{

    void callNumber(int phoneNumber)
    {
        System.out.println("Calling Number "+phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Picking call");
    }
}

class PersonalSmartPhone extends CellPhone implements Camera,Wifi{
    public void takePicture()
    {
        System.out.println("Taking picture");
    }
    
    public void recordVideo()
    {
        System.out.println("Recording normal video");
    }

    public String[] getAvailableNetworks()
    {
        System.out.println("Getting list of networks");
        String[] networksList = {"Open Network", "MyWifi" , "User123"};
        return networksList;
    }

    public void connectToNetwork(String networkName)
    {
        System.out.println("Connecting to network "+networkName);
    }
}


public class JavaPhoneInterface {
    
    public static void main(String[] args) {
        PersonalSmartPhone p = new PersonalSmartPhone();
        System.out.println();
        p.takePicture();
        String[] availableNetworks = p.getAvailableNetworks();
        for(String network:availableNetworks)
        {
            System.out.println(network+" ");
        }

        //Runtime Polymorphism
        Wifi wifiPhone = new PersonalSmartPhone(); //Now this smartphone is only used as a wifi device
        wifiPhone.connectToNetwork("Test");
        // wifiPhone.takeSnap(); Not Allowed
    }
}
