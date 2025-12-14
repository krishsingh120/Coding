public class InvertedStar {
    public static void main(String[] args){
        int i,j;
        for(i=0;i<4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print("*");
            }  
            System.out.println();   
        }   
    }
}
