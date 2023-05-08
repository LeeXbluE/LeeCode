package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L122_XX_MaxProfit2 {

    public static void main(String[] args) {
        L122_XX_MaxProfit2 a = new L122_XX_MaxProfit2();
        int i = a.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }

    /**
     * 多解，需要看看
     * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/solutions/38498/tan-xin-suan-fa-by-liweiwei1419-2/
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int totalPrice = 0;

        for (int i = 1; i < prices.length; i++) {
            int totayPrice = prices[i];
            int yesterdayPrice = prices[i - 1];
            int profit = totayPrice - yesterdayPrice;
            if (profit > 0) {
                totalPrice += profit;
            }
        }
        return totalPrice;
    }
}
