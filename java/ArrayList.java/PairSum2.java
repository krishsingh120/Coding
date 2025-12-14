import java.util.ArrayList;

public class PairSum2 {
    public static boolean sum(ArrayList<Integer> arr, int target){
        // find pivot index
        int rp = -1;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > arr.get(i+1)){
                rp = i;
                break;
            }
        }
        int n = arr.size();
        int lp = rp+1;
        while(lp != rp){
            if(arr.get(lp) + arr.get(rp) == target){
                return true;
            } else if(arr.get(lp) + arr.get(rp) < target){
                lp = (lp+1) % n;
            } else if(arr.get(lp) + arr.get(rp) > target){
                rp = (n+rp-1) % n;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        
         arr.add(11);
         arr.add(15);
         arr.add(6);
         arr.add(8);
         arr.add(9);
         arr.add(10);
        
       
        System.out.print(sum(arr, 16));
    }
}
