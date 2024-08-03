import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        // put(key,value) : Adds a key value pair to the hashmap
        hm.put("Test",1);
        hm.put("Another Test",2);
        hm.put("Test3",2);

        // get(key) : Gets value for the specified key
        System.out.println("The value for key 'Test' is : " + hm.get("Test"));
        
        // remove(key) : Removes the key mapping from the hashmap
        hm.remove("Test3");

        // replace(key,value) : Replaces the value for the specified key
        System.out.println(hm);
        hm.replace("Another Test",10);
        System.out.println(hm);

        // size() : Returns the size of the hashmap
        System.out.println("Size of hashmap is : "+hm.size());

        // clear() : Clears the hashmap
        // hm.clear();


        for(String key:hm.keySet())
        {
            System.out.println(key + " : " + hm.get(key));
        }
    }
}
