public class Allsubseq {
    public static void  allsubsequence(String str , int idx ,String newstr){
        // base case
       if(idx==str.length()){
        System.out.println(newstr);
         return;
       }
       char  currchar = str.charAt(idx);
        // choice 
        // to be 
        allsubsequence(str, idx+1, newstr + currchar);
     
        // not to be
        allsubsequence(str, idx+1, newstr);
    }
    public static void main(String[] args){
        String str = "abc";
        String newstr = new String();
       allsubsequence(str,0,newstr);
   
    }
}
