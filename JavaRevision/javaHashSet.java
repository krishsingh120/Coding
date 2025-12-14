import java.util.HashSet;
import java.util.Iterator;

public class javaHashSet {

    public static void basics() {
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(5);
        // set.add(5);

        // System.out.println(set);
        // System.out.println(set.size());

        // set.remove(3);
        // if (set.contains(3)) {
        // System.out.println("Contains 3");
        // } else {
        // System.out.println("Not contains 3");
        // }

        // if (set.contains(6)) {
        // System.out.println("Contains 6");
        // } else {
        // System.out.println("Not contains 6");
        // }

        // set.clear();
        // System.out.println(set.size());

        // System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Hydrabad");
        cities.add("Bangerluru");

        // using iterators
        // Iterator it = cities.iterator();

        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }

        // using loops
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static int CountDistint(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }

    public static int UnionOfElem(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);
        return set.size();
    }

    public static int IntersectionOfElem(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();


        int n = arr1.length;
        int m = arr2.length;

        for (int num : arr1) {
            set.add(num); 
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num); // store only common elements
            }
        }

        System.out.println(result);
        return result.size();
    }

    public static void main(String args[]) {
        // basics();

        // int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        // System.out.println(CountDistint(arr));

        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 6, 4 };

        // System.out.println(UnionOfElem(arr1, arr2));
        System.out.println(IntersectionOfElem(arr1, arr2));

    }
}
