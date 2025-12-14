public class MoveAllX {

    public static void moveallX(String str , int idx ,int count ,String newstr){
        // base case
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newstr += "x";
            }
         System.out.print(newstr);
           return;
        }
        // kaam
       if(str.charAt(idx)=='x'){
         count++;
         moveallX(str , idx+1,count , newstr);  // recursion
       }
       else {
        newstr += str.charAt(idx);
        moveallX(str , idx+1,count , newstr);  // recursion
       }
     
    }
    public static void main(String[] args){
        String str = "axbcxxd";
        String newstr = new String();
        moveallX(str,0,0,newstr);
   
    }
}
