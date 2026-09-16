import java.util.LinkedHashMap;
public class LH1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);

        System.out.println(lhm);

    }
}

/*
import java.util.LinkedHashMap;
LinkedHashMap<K,V > hm=new LinkedHashMap<>();

keys are in insertion ordered
same operations with same time complexities such as HashMap
Doubly Linked List is used inside LinkedHashMap
*/
