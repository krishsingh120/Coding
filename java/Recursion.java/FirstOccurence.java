public class FirstOccurence {
    public static int fisOcc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return fisOcc(arr,i+1,key);
    }
    public static void main(String[] args){
        int arr[] = {8,2,4,5,3,1,5,9};
        int key=5;
        System.out.print(fisOcc(arr,0,key));
    }
}
