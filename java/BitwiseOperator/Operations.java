import java.util.*;
public class Operations {
    public static int ClearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        int ans = (n & bitMask);
        System.out.println(ans);
        return ans;
    }


    public static int SetIthBit(int n , int i){
        int bitMask = (1<<i);
        int ans = (n | bitMask);
        // System.out.println(ans);
        return ans;
    }


    public static void GetIthBit(int n , int i){
        int bitMask = (1<<i);

        if((n & bitMask) != 0){
            System.out.println("ith bit is : " + 1);
        }
        else{
            System.out.println("ith bit is : " + 0);
        }
    }

    public static int UpdateIthBit(int n , int i , int newBit){
        // if(newBit == 0){
        //     return ClearIthBit(n , i);
        // }
        // else{
        //    return SetIthBit(n , i);
        // }

        n = ClearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static int ClearLastIBit(int n , int i){
        int BitMask = (~0<<i);
        return n & BitMask;
    }

    public static int ClearRange(int n , int i, int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i) - 1;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static boolean powerOf2(int n ){
        int ans = n & (n-1);
        return (ans == 0);
    }

    public static int countSetBit(int n ){
        int cnt = 0;
        while(n > 0){
            if((n&1) != 0){
               cnt++;
            }
            n = n >> 1;
        }
        return cnt;
    }


    public static void main(String[] args){
        // GetIthBit(15 , 4);
        // SetIthBit(10 , 2);
        // ClearIthBit(10 , 1);
        // System.out.println(UpdateIthBit(10 , 2 , 1));
        // System.out.println(ClearLastIBit(15 , 2));
        // System.out.println(ClearRange(15 , 1 , 2));
        // System.out.println(powerOf2(13));
        System.out.println(countSetBit(7));
    }
}
