package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L121_MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int winPrice = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > winPrice) {
                winPrice = price - minPrice;
            }
        }
        return winPrice;
    }

}
