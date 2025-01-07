package Arrays.easy.P02;

public class BestTimetoBuyAndSellStock {

    //given array of prices [7,1,5,3,6,4]
    // to maximise the profit by choosing single day to buy stock and choosing different day to sell stock.
    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
    private static int maxProfit(int[] prices){

        int profit = 0;
        int min_prices = prices[0];
        for(int i=0;i<prices.length;i++){
            min_prices = Math.min(prices[i],min_prices);
            profit=Math.max(profit,prices[i]-min_prices);
        }
        return  profit;
    }
}
