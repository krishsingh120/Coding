public class TilingProblem {
    public static int numOfways(int n){
        if(n==0 || n==1){
            return 1;
        }
        // Kaam
        // vertical choice 
        int ver=numOfways(n-1);

        // horizontal choice 
        int hor=numOfways(n-2);

        int tw=ver+hor;
        return tw;

    }
    public static void main(String[] args){
        int n=5;
        System.out.print(numOfways(n));
    }
}
