public class fibo {

    public static int f(int n){
        if(n <= 1){
            return n;
        }

        int f = f(n -1);
        int l = f(n - 2);

        return f + l;
    }
    public static void main(String[] args) {
        System.out.println(f(7));
    }
}
