public class Transpose3 {
     
    public static void print(int trans[][], int n){

        for(int i=0; i<n; i++){
            for(int j=0;  j<n; j++){
                System.out.print(" "+trans[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int trans[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = trans.length;

        // transpose 
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
               int temp=trans[i][j];
               trans[i][j]=trans[j][i];
               trans[j][i]=temp;
            }
        }
        // print transpose
        print(trans,n);
    }    
}
