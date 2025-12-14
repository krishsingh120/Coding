import java.util.*;
public class GSTbill {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     float pencil=sc.nextFloat();
     float pen=sc.nextFloat();
     float eraser=sc.nextFloat();
      float total=(pen+pencil+eraser);
       System.out.println("bill is:" +total);
       // 18% GST on bill.
       float newtotal= total*(0.18f*total);

       System.out.println("Bill with 18% tax is:" +newtotal);
    }
}