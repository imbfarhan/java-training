import java.util.ArrayDeque;

public class JavaDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        
        System.out.println("Deque Program");
        // add(element) : Inserts the element at the end of the queue
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);

        // addFirst(element) : Inserts the element at the start of the queue
        ad1.addFirst(90);

        // addLast(element) : Inserts the element at the end of the queue
        ad1.addLast(5);

        // getFirst() : Returns the first element of the queue
        System.out.println(ad1.getFirst());

        // getLast() : Returns the last element of the queue
        System.out.println(ad1.getLast());

 
    }
}
