public class Zero_one_triangle {
    public static void main(String[] args){
        int n = 5;
        int zero = 0 , one = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1;  j<=i; j++){
                // condition of one.
                if( (i+j) % 2 == 0 ){
                  System.out.print(" "+one);

                }  else {  // condition of zero.
                    System.out.print(" "+zero);
                }
            }
              System.out.println();
        }
    }
    
}
