import java.util.HashMap;
import java.util.Set;
public class H1{
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();    //Create

        hm.put("India",1000);
        hm.put("China",1500);
        hm.put("US",600);

        System.out.println(hm);

        int population =hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));    // This will return Null as the key doesn't exists.

        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());//False
        /*hm.clear();
        System.out.println(hm.isEmpty());// True
        System.out.println(hm);*/

        // Iteration

        Set<String> keys=hm.keySet();
        //for each
        for(String k:keys){
            System.out.println("key="+k+",value="+hm.get(k));
        }



    }
}

// Hashing gives us two new Data Structures : Maps and Sets
// 3 types of Maps : HashMap , Linked HashMap , TreeMap
// 3 types of Maps : HashSet , Linked HashSet , TreeSet

// HashMap is used to store data in (key,value) pair. Every key is unique. Time Complexity of Insertion, Removal , Searching is O(1).Example (Country,Population), here Country is the key.
// Structure : HashMap is stored as Array of Linked List (Buckets of LinkedList)
/*
import java.util.HashMap;

HashMap<Datatype Key, DataType Integer> hm=new HashMap<>();

hm.put(key,value)   O(1)    For adding info in the HashMap

hm.get(key)     O(1)    For accessing a particular key in the map  and gets its corresponding value

hm.containsKey(key name)    O(1)    Its gives true/false based on if the key exists

hm.remove(key)  O(1)    It removes the key and also returns its value for once and the Map is edited

hm.size()   Returns the size of the map i.e. return the total number of pairs

hm.isEmpty()    Returns true if map is empty , else false

hm.clear()      Clears the whole map

Set<Datatype> keys=hm.keySet()      basis of iteration in HashMap


*/

