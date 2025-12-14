public class mazePath {
    public static int findpath(int i, int j, int n, int m){
        // base case
        if(i==n || j==m) 
           return 0;
        if(i==n-1 && j==m-1){
            return 1;
        }
    
        // move downward
        int down = findpath(i+1, j, n, m);

        // move right
        int right = findpath(i, j+1, n, m);

        return right + down;
    }
    public static void main(String[] args){
            int n=3 , m=3;
            int totalpath = findpath(0, 0, n, m);
            System.out.print(totalpath);
 
    }    
}
