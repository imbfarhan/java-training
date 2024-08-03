interface AnonymousDemoInterface{
    void meth1();
    void meth2();
}

//IF WE ARE USING THE CLASS ONLY ONCE, IT IS TEDIOUS TO WRITE THE ENTIRE IMPLENTATION FOT THE CLASS. 

// class AnonymousDemoClass implements AnonymousDemoInterface{
    
//     @Override
//     public void meth1(){
//         System.out.println("Meth1 Implemented");
//     }

//     @Override
//     public void meth2()
//     {
//         System.out.println("Meth2 Implemented");
//     }

// }

public class JavaAnonymousClass{

    public static void main(String[] args) {

    //If we have to use the interface only once, no need to write an entire class and use it
    //We can use anonymous class

    AnonymousDemoInterface obj = new AnonymousDemoInterface() {
        @Override
        public void meth1(){
            System.out.println("Meth1 Implemented");
        }
    
        @Override
        public void meth2()
        {
            System.out.println("Meth2 Implemented");
        }
    };

    obj.meth1();
    }
}