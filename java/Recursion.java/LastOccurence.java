public class LastOccurence {
    public static int lastOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
       int isfound = lastOcc(arr,i+1,key);
        if(isfound==-1 && arr[i]==key){
              return i;
        }
        return isfound;
    }
    public static void main(String[] args){
        int arr[] = {8,2,4,5,3,1,5,9};
        int key=5;
        System.out.print(lastOcc(arr,0,key));
    }
}
