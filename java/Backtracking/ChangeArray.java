public class ChangeArray {
    public static void changearr(int arr[] , int i) {   // TC--> O(n)
          // base case
          if(i==arr.length){
            return;
          }
          arr[i] = i+1;
          System.out.println(arr[i]);
          changearr(arr,i+1);  // recursion call
          arr[i] += -2;        // backtracking
          System.out.print(arr[i]);
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changearr(arr,0);
    }
}
