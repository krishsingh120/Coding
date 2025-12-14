
public class kadanesAlgo {
    public static void kadanealgo(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            if(cs<0){     // kadane's algorithm
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
          System.out.print(ms);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        kadanealgo(arr);
    }
}
