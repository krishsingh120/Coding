import java.util.*;
public class basics {
    public static void main(String[] args) {
       // create hashMap 
       HashMap<String,Integer> hm = new HashMap<>();
       hm.put("India",100);
       hm.put("China",150);
       hm.put("usa",200);
       hm.put("indonasia",50);

       // print hashmap
       System.out.println(hm);

    //    // get operation
    //    int pop = hm.get("India");
    //    System.out.println(pop);
    //    // containsKey
    //    System.out.println(hm.containsKey("India"));
    //    // remove key
    //    System.out.println(hm.remove("China"));
    //    System.out.println(hm);

    //    // size of hashmap
    //    System.out.println(hm.size());



       // iteration on hashmap 
       Set<String> keys = hm.keySet();

       for (String k : keys) {
        System.out.println(k);
       }

    }
}