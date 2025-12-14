import java.util.*;
public class breakQuestion {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter number:");
            int n=sc.nextInt();
            if(n%10==0) break;
            else System.out.println(n);
        } while(true);
    }
}
