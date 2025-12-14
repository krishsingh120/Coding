import java.util.ArrayList;

public class basic {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // operations in arraylist
        list.add(1);  // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get element
        // System.out.println(list.get(3));  // O(1)

        // remove element
        // System.out.println(list.remove(2));
        // System.out.println(list);

        // set
        // list.set(2,20);
        // System.out.println(list);

        // contains
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(12));
        
        // size
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
