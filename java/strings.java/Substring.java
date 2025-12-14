public class Substring {
    
    public static String substring(String str,int si,int ei){
        String substr = "";  //  create empty string.
        for(int i=si; i<ei; i++){
            substr = substr + str.charAt(i);  // Concatenation
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(0,5));
        System.out.print(substring(str,0,5));
    }
}
