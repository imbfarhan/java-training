/* FOUR PILLARS OF OOPS:
        Abstraction: Show only essential info
        Encapsulation: Putting various things together
        Polymorphism : Ability to exhibit multiple forms
        Inheritance : Inheriting from existing things
 */



class Employee{
    int id;
    String name;


    //COMMIT 1
    public void printDetails()
    {
        System.out.println("Employee ID: "+this.id);
        System.out.println("Employee Name: "+this.name);
    }

    Employee() //Default Constructor
    {
        this.id=0;
        this.name="NoName";
    }

    Employee(int id,String name) //Parameterized Constructor
    {
        this.id=id;
        this.name=name;
    }

    void getEmployeeDetails()
    {
        System.out.println("\nthis employee id: "+this.id);
        System.out.println("this employee name: "+this.name);
    }


}


public class JavaOOP {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.id=123;
        e.name="Farhan";
        e.printDetails();

        //Constructing a default object
        Employee defaultEmployee = new Employee();
        defaultEmployee.getEmployeeDetails();

        //Constructing a parameterized object
        Employee parameterizedEmployee = new Employee(456, "John");
        parameterizedEmployee.getEmployeeDetails();
    }
}
