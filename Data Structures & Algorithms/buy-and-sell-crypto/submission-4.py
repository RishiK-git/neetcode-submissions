class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for buy in range(len(prices)):
            window = prices[buy:]
            for sell in window:
                profit = max(profit, (sell - prices[buy]))

        return profit
