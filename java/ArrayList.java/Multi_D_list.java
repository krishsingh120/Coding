import java.util.ArrayList;

public class Multi_D_list {
     public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // // list1 
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // mainList.add(list1);
        
        // // list2
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4);
        // list2.add(5);
        // list2.add(6);
        // mainList.add(list2);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
         for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
         }

         mainList.add(list1);
         mainList.add(list2);
         mainList.add(list3);

       // print mainlist
        System.out.println(mainList);


        // for(int i=0; i<=mainList.size()-1; i++){
        //     ArrayList<Integer> currlist = mainList.get(i);

        //     for(int j=0; j<=currlist.size()-1; j++){
        //         System.out.print(" "+currlist.get(j));
        //     }
        //          System.out.println();
        // }


    }  
}
