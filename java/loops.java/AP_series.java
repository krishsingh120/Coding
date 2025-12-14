import java.util.*;

public class AP_series {

    public static void ReverseAPseries(int n){

        // AP: 100,97,94......upto all.

               int a=100;
             for(int i=1; i<=n; i++){
                 if(a>0){
                 System.out.print( " "+ a);
                 }
                     a=a-3;
         }     
    }

    public static void PrintAPseries(int n){

       /*    AP: 1,3,5,7......upto 'n'.
               a = 4, d = 3, n = n          */

               int a=1;
             for(int i=1; i<=n; i++){
                 
               System.out.print( " "+ a);
                  a=a+3;
         }     
    }


    public static void PrintSum(int n){
        int sum = 0;

        for(int i=4; i<=(3*n+1); i=i+3){
               sum += i;
        }    System.out.println("sum is: " +sum);
    }


    public static void GPseries(int n){

        /*  GP: 1,2,4,8,16..... upto 'n'.
              a = 1, r = 2, n = n          */

                int a=1;
              for(int i=1; i<=n; i++){
                 System.out.print( " "+ a);
                   a=a*2;
              }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number:");
        int n = sc.nextInt();
       
            // ReverseAPseries(n);
            // PrintAPseries(n);
            // PrintSum(n);
            // GPseries(n);
    }
}
