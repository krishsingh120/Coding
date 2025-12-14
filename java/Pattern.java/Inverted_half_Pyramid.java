public class Inverted_half_Pyramid {
    
    public static void main(String[] args){

      /* In this pattern 3 nested loops are used, i--> outer, j --> inner spaces & k --> stars
      1st loop is used to print the number of spaces,
      2nd loop is used to print the number of stars,
      3rd loop is used to print the number of spaces.   */
           

         int n = 6;
        // outer loop for lines/rows
        for(int i=1; i<=n; i++){

            // inner loop for spaces
            for(int j=1; j<=n-i; j++){
              System.out.print(" ");
            } 

             // inner loop for stars
             for(int k=1; k<=i; k++){
                System.out.print("*");
              }

              System.out.println();
        }    
    }
}
