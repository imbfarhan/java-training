import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet<>();
        System.out.println("HashSet in Java");
        // add(element) : Adds the element to the hash set
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(2);

        // remove(element) : Removes the element from the hash set
        hashSet.remove(1);

        // size() : Returns the size of the hashset
        System.out.println("Size of Hashset :"+hashSet.size());
        System.out.println("Elements of hashset are:");
        System.out.println(hashSet);


    }
}
