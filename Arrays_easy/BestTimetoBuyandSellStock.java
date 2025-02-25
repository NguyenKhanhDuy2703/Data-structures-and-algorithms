/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */

// give a array  prices => return maximum profit >< return 0

public class BestTimetoBuyandSellStock {
//     public static int maxProfit(int[] prices) {
//        int currProfit = 0 ;
//        for(int buy = 0; buy < prices.length ; buy++){
//            for(int sell = buy ; sell < prices.length; sell++ ){
//                int profit = prices[sell] - prices[buy];
//                if(profit > currProfit){
//                    currProfit = profit;
//                }
//            }
//        }
//        return currProfit;
//    }
    public  static int maxProfit (int [] prices){
        int maxprofit = 0 ;
        int buy = prices[0];    
        for(int sell = 1 ;  sell < prices.length ; sell++){
            if(prices[sell] <= buy){
                buy = prices[sell];
            }else{
                 int profit =  prices[sell] -buy;
                if( profit > maxprofit)maxprofit = profit;
            }
            
        }
        return  maxprofit;
        
    }
     
    public static void main(String[] args) {    
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
