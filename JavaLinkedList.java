import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        //Most of the methods that work with array list also work with linked list
        //There are some more methods that work with linked list specifically

        //Methods of arraylist that work with linked list are:

        System.out.println();
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        // LinkedList<Integer> l2 = new LinkedList<>(5); -> This wont work since constructor for linked list does not take initial size

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
        
        
        System.out.println("LinkedList (New) Methods");
        //Methods that are specific to LinkedList are:


        // addFirst(element) : Adds the specified element to the beginning of the linked list
        l1.addFirst(900);
        
        
        // addLast(element) : Adds the specified element to the end of the linked list
        l1.addLast(200);

        System.out.println("Printing the LinkedList");
        for(int e:l1)
        {
            System.out.println(e);
        }


    }
}
