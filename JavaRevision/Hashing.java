import java.util.HashMap;
import java.util.Set;

public class Hashing {

    public static void majorityElement(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        int val;

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hm.containsKey(key)) {
                val = hm.get(key);
                val++;
                hm.put(key, val);
            } else {
                val = 1;
                hm.put(key, val);
            }

            // // shortHand
            // hm.put(arr[i], hm.getOrDefault(arr[i], 0 ) + 1);


        }

        Set<Integer> keys = hm.keySet();
        // System.out.println(keys);
        // int majElem = 0;
        // int a = 0;
        // for (Integer key : keys) {
        // int elem = hm.get(key);
        // if (elem > (n / 3)) {
        // majElem = elem;
        // a = key;
        // }
        // }

        // System.out.println(a + " => " + majElem);

        for (Integer key : keys) {
            if (hm.get(key) > (n / 3)) {
                System.out.println("the key is: " + key);
            }
        }

    }

    public static void basic(HashMap<String, Integer> hm) {
        // insertion operation
        hm.put("india", 100);
        hm.put("china", 50);
        hm.put("USA", 150);
        hm.put("indonsia", 60);
        hm.put("swedien", 120);
        hm.put("russia", 6000);

        // System.out.println(hm);
        // System.out.println(hm.size());

        // // get operation
        // int ans = hm.get("india"); // return value
        // System.out.println(ans);

        // // containsKey operation
        // boolean res = hm.containsKey("india");
        // System.out.println(res);

        // // remove operation
        // int val = hm.remove("china");
        // System.out.println(hm);
        // System.out.println(val);

        // System.out.println(hm.isEmpty());

        // hm.clear();
        // System.out.println(hm.isEmpty());

        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        int max = 0;
        for (String key : keys) {
            if (max < hm.get(key)) {
                max = hm.get(key);
            }
            System.out.println(hm.get(key));
        }

        System.out.println("max key value is : " + max);

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // basic(hm);

        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        majorityElement(arr);
    }
}
