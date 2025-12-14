public class Transpose2 {
    public static void print(int matrix[][],int row,int col){
        for(int i=0; i<row; i++){
            for(int j=0;  j<col; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int arr[][] = {{1,2,3},{4,5,6}};
        int row = arr.length;
        int col = arr[0].length;

         // print matrix
        print (arr,row,col);
        System.out.println();
       
        // transpose
         int trans[][] = new int[col][row];

        for(int i=0; i<col; i++){
            for(int j=0;  j<row; j++){
               trans[i][j] = arr[j][i];
            }
        }  

        //  print transpose
      
        for(int i=0; i<col; i++){
            for(int j=0;  j<row; j++){
                System.out.print(" "+ trans[i][j]);
            }
            System.out.println();
        }

       
    }    

}
