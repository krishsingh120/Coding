import java.util.*;
public class basic {
    public static void printHelloWorld(){
        System.out.println("hello world!");
        return;
    }

    public static int calculateSum(int num1,int num2){          //(a,b)-> are parameters or formal parameters
      int sum=num1+num2;
      return sum;
    }
    public static int swap(int x,int y){                      // java always call by value
       // swap
       int temp=x;
           x=y;
           y=temp;
          
          
           
    }
    public static void main(String args[]){
        printHelloWorld();          // function call
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);  // function call         // (a,b)-> are arguments or actual parameters
        System.out.println("sum is: "+sum);
        int x=5,y=10;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}


class A{

}