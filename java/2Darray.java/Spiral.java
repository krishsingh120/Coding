import javax.sound.sampled.AudioFormat.Encoding;

public class Spiral {

     public static void sprial(int arr[][],int n, int m){
          int StartRow=0;
          int StartCol=0;
          int EndRow=n-1;
          int EndCol=m-1;

          while(StartRow <= EndRow && StartCol <= EndCol){
              // top
              for(int i=StartCol; i<=EndCol; i++){
                  System.out.print(arr[StartRow][i]+" ");
              }

              // right
              for(int i=StartRow+1; i<=EndRow; i++){
                System.out.print(arr[i][EndCol]+" ");
            }

             // bottom
             for(int i=EndCol-1; i>=StartCol; i--){
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(arr[EndRow][i]+" ");
            }

            // left
            for(int i=EndRow-1; i>=StartRow+1; i--){
                if(StartCol==EndCol){
                    break;
                }
                System.out.print(arr[i][StartCol]+" ");
            }

            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;

          }
     }

    public static void main(String[] args){

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
        sprial(arr,n,m);
    }    
}
