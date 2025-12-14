public class String_builder {
    public static void main(String[] args){         //  T.C -> O(26)
         StringBuilder sb = new StringBuilder("");
         for(char ch='a'; ch<='z'; ch++){
              sb.append(ch);   // a b c d e ........z
         }
         System.out.println(sb);
         System.out.println(sb.length());
    }
}
