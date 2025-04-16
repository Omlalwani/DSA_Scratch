package Array;

public class StockBuyAndSell
{
    static int profitCalc(int[] price, int start, int end)
    {
        if(end <= start)
            return 0;
        int profit = 0;

        for(int i = start; i < end; i++)
        {
            for(int j = i+1; j<= end; j++)
            {
                if(price[j] > price[i])
                {
                    int curr_profit = price[j] - price[i] +
                            profitCalc(price, start, i-1) +
                            profitCalc(price, j+1, end);
                    profit = Integer.max(profit, curr_profit);
                }
            }
        }

        return profit;
    } //O(n^2)

    static int maxProfit(int[] price)
    {
        int n = price.length-1;
        int profit = 0;
        for(int i=1; i<=n; i++)
        {
            if(price[i] > price[i-1])
                profit += (price[i] - price[i-1]);
        }
        return profit;
    } //O(n)

    public static void main(String[] args) {
        int[] price ={1,5,3,8,12};
        int start = 0;
        int end = price.length-1;

        System.out.println(profitCalc(price, start, end));
        System.out.println(maxProfit(price));
    }
}
