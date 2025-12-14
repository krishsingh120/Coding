import java.util.*;
public class input {
    public static void printstr(String str){
        
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        // char ch[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz@#!");
        //  // Strings are immutable
            
        // Scanner sc = new Scanner(System.in);

        //   // input string
        // String name;
        // name=sc.nextLine();
        // System.out.print(name);

        //  // string length
        //  String fullname="krish singh";
        //  System.out.print(fullname.length());

          // Concatenation
         String firstname="krish";
         String lastname="singh";
         String fullname=firstname + " " + lastname;
         System.out.println(fullname);
           // string (charAt) method
           System.out.println(fullname.charAt(9));
           printstr(fullname);

    }
}
