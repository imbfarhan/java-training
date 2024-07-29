public class JavaVarArgs {
    //Takes ANY number of arguments
    static void varArgsMethod(int... a)
    {
        int result=0;
        for(int element:a)
        {
            result=result+element;
        }
        System.out.println("VarArgs Total = "+result);
    }

    //Takes ATLEAST ONE argument
    static void atleastOneVarArg(int a, int... b)
    {
        System.out.println("REQUIRED element = "+a);
        if(b!=null)
        {
            System.out.println("Optional elements:");
            for(int element:b)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        varArgsMethod(10,20,30,40);
        varArgsMethod(100,200);

        //REQUIRES ATLEAST ONE ELEMENT
        atleastOneVarArg(1, null);
        atleastOneVarArg(20,2,3,4);
    }
}
