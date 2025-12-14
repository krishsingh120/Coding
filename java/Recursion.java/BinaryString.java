public class BinaryString {
    public static void binstr(int n, int lastplace, String str){
        // base case
     if(n==0){
        System.out.println(str);
        return;
     }
       // kaam
    //    if(lastplace==0){
    //       // site 0 on chair n
    //       binstr(n-1, 0, str.append("0"));
    //       // site 1 on chair n
    //       binstr(n-1, 1, str.append("1"));
    //    } else {

    //       binstr(n-1, 0, str.append("0"));
    //    }
         // kaam
        binstr(n-1, 0, str + "0");
        if(lastplace==0){
            binstr(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {

         binstr(3, 0, ""); 
    }
}
