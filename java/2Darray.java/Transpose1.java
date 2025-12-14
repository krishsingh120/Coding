public class Transpose1 {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6}};
        int n = arr.length;
        int m = arr[0].length;

        // print matrix

        for(int i=0; i<arr.length; i++){
            for(int j=0;  j<arr[0].length; j++){
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
         
        // print transpose 

        for(int i=0; i<m; i++){
            for(int j=0;  j<n; j++){
                System.out.print(" "+ arr[j][i]);
            }
            System.out.println();
        }


    }
}
