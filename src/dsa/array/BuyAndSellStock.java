package dsa.array;

public class BuyAndSellStock {
	public int buyAndSellStock(int price[]) {
		int maxProfit = 0 ,buyPrice = Integer.MAX_VALUE;
		
		for(int i=0;i<price.length;i++) {
			if(price[i] > buyPrice) {
				int profit = price[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}else {
				buyPrice = price[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println(new BuyAndSellStock().buyAndSellStock(arr));
	}
}
