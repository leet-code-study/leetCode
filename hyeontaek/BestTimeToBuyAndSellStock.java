package hyeontaek;

public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int min = Integer.MAX_VALUE;
    for (int price : prices) {
      min = Math.min(min, price);
      maxProfit = Math.max(maxProfit, price - min);
    }
    return maxProfit;
  }

  public int maxProfit2(int[] prices) {
    int buy = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      } else if (prices[i] - buy > profit) {
        profit = prices[i] - buy;
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println(solution.maxProfit(prices));
    System.out.println(solution.maxProfit2(prices));
  }
}
