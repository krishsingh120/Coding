public class stringCompare {
     public static void main(String args[]){
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");
        if(s1==s2){
          System.out.println("strings are same");
        }
        else{
            System.out.print("strings are not same");
        }

        if(s1.equals(s3)){   // equal function
            System.out.println("strings are same");
        }
        else{
            System.out.print("strings are not same");
        }
     }    
}
