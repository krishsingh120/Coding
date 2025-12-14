public class RotatedArray {
        public static int findidx(int arr[], int tar, int si, int ei) {
              // kaam
              int mid = si +  (ei - si) / 2;
              // case found 
              if(arr[mid] == tar){
                return mid;
              }

              // mid on L1
              if(arr[si] <= arr[mid]){
                // case : a
                  if(arr[si] <= tar && tar <= arr[mid]){
                    return findidx(arr, tar, si, mid-1);
                  } else {
                    // case : b
                    return findidx(arr, tar, mid + 1, ei);
                  }
              }

              // mid on L2
              if(arr[mid] <= arr[ei]){
                    // case : c
                  if(arr[mid] <= tar && tar <= arr[ei]){
                    return findidx(arr, tar, mid + 1, ei);
                  } else {
                    // case : d
                    return findidx(arr, tar, si, mid - 1);
                  }
               }
               return -1;
        }
    
    
        public static void main(String args[]){
            int arr[] = {4,5,6,7,0,1,2};
            int target = 0;
            int idx = findidx(arr, target , 0, arr.length-1);
            System.out.println("Target index is : " + idx);
        }
}
