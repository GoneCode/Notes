package Arrays.easy.P05;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int res = bestTime(prices);
        int result = valleyPeak(prices);
        System.out.println(res);
        System.out.println(result);

    }

    private static int bestTime(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }

    private static int valleyPeak(int[] prices){
        int i=0;
        int profit=0;
        int n = prices.length;
        while(i<n-1){
            // find the valley(local minimum)
            while(i<n-1 && prices[i]>=prices[i+1]){
                i++;
            }
            int valley = prices[i];

            while(i<n-1 && prices[i]<=prices[i+1]){
                i++;
            }
            int peak = prices[i];

            profit+=peak-valley;

        }
        return profit;
    }
}
