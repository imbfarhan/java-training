import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        //add(element,index) : Adds elements to list

        l2.add(15);
        l2.add(20);


        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(6);
        l1.add(0,1);
        l1.add(0,2);

        // addAll(index,collection) : Adds element of another collection to the current collection at specified index
        l1.addAll(0,l2);

        //clear() : Clears all the elements from the arraylist
        // l1.clear();

        
        
        for(int i=0;i<l1.size();i++)
        { 
            //get(index) : Gets element at i'th index
            System.out.println(l1.get(i));
        }
        
        // contains(element) : Checks if the arraylist contains the specified element
        System.out.println(l1.contains(7));

        // indexOf(element) : Prints index of the element, if it is available
        System.out.println(l1.indexOf(20));

        //lastIndexOf(element) : Prints the last index of the specified element
        System.out.println(l1.lastIndexOf(6));

        //set(index,element) : Sets the specified element at the specified index
        l1.set(0,256);

        // remove(index) : Removes the element at the specified index
        l1.remove(0);

        System.out.println("Hello");
    }
}
