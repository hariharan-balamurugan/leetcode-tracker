// Last updated: 8/9/2026, 11:43:18 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxprofit=0;
4        int buy =prices[0];
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]<buy){
7                 buy=prices[i];
8            }else{
9                maxprofit =Math.max(maxprofit,prices[i]-buy);
10               
11            }
12        }
13        return maxprofit;
14    }
15}