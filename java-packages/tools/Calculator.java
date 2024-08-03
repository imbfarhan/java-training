package tools;


public class Calculator {
    public int addition(int ... intArray)
    {
        int result=0;
        for(int element:intArray)
        {
            result+=element;
        }
        return result;
    }

    public int subtraction(int a,int b)
    {
        return a-b;
    }
}
