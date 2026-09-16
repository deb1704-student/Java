import java.util.TreeMap;

public class TM1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> thm=new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 50);
        thm.put("Nepal", 5);

        System.out.println(thm);

    }
}
/*
keys are sorted
put,get,remove are O(log n)
TreeMap<K,V> hm=new TreeMap<>();

Red Black Trees are used as internal data structures
*/
