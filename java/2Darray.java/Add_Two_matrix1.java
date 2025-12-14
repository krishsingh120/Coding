public class Add_Two_matrix1 {
    public static void main(String[] args){

        int a[][]={{1,2},{3,4}};
        int b[][]={{5,6},{7,8}};
        int res[][]=new int[2][2];
  
          // Add two matrix 
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
               res[i][j] = a[i][j] + b[i][j];
            }
        }

        // print resultant matrix
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}