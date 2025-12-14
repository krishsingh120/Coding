import java.util.*;;
public class binTOdec {

    public static void bintodec(int binNum){
        int mynum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int ld= binNum % 10;
            decNum = decNum + (ld * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
          System.out.print("decimal of " +mynum+" = " +decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
            int binNum=sc.nextInt();
            bintodec(binNum);
    }
}
