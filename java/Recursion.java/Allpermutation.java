public class Allpermutation {
    public static void  printperm(String str ,String permutation){  // TC = O(n!)
        // base case
       if(str.length()==0){
         System.out.println(permutation);
         return;
       }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            // "abc" --> "ab"
            String newstr = str.substring(0, i) + str.substring(i+1);
            // recursive call
            printperm(newstr, permutation + currchar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printperm(str, "");
   
    }
}
