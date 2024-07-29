public class JavaArrays {
    public static void main(String[] args) {
    //Array of size 5 for int
     int[] marks = new int[5];
     //marks is reference, the int[5] that you have created is object
     
     
     int[] m; //Declaration
     m = new int[5]; //Memory Allocation

     int[] marks2 = new int[5]; //Declaration and memory allocation

     int[] marks3 = {100,200,300};// Declaration and Initialization

    System.out.println("marsk3 length: "+marks3.length);

    System.out.println("Using FOR loop");
     //FOR loop
     for(int i=0;i<marks3.length;i++)
     {
        System.out.println(marks3[i]);
     }
     System.out.println();
     System.out.println("Using FOR-EACH loop");
     
     //FOREACH loop
     for(int element:marks3)
     {
        System.out.println(element);
     }

     //2D array
     int[][] array2D = new int[3][3];
     System.out.println(array2D[0][0]);
     System.out.println();
     int counter=0;
     //Intiializing 2d array elements using a for loop
     for(int i=0;i<array2D.length;i++) //array2D.length returns the number of rows of 2d array
     {
        for(int j=0;j<array2D[0].length;j++) //array2D[0].length will return number of columns in first row
        {
            array2D[i][j]=counter;
            counter++;
        }
    }


    array2D[0][0] = 125;
     //A 2d array is array of arrays. To use foreach, we first access each array, and then print the elements from that array

     for(int[] array:array2D)
     {
        for(int element:array)
        {
            System.out.print(element+" ");
        }
        System.out.println();
     }
    }
}
