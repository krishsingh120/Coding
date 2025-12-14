public class BUYandSell {

   public static int maxProfit(int price[]){

    int n=price.length;
    int minprice=price[0];
    int maxprofit=0;

        for(int i=0; i<n; i++){             //   T.C-> O(n)
            if(price[i]>minprice){         // find min buy price
                minprice=price[i];        // update min price 
            }
             else {                               // find profit : selling price > buy price 
               int profit=price[i]-minprice;
               if(profit>maxprofit){
                   maxprofit=profit;
               }
            }
        }
        
        return maxprofit;

   }

    public static void main(String[] args){
        int[] price = {7,1,5,3,6,4};
        System.out.println("max profit is : "+ maxProfit(price));
    }
}
