package com.leex.alg.BM;

/**
 * @title: BM64XX_MinCostClimbingStairs
 * @Author LeeX
 * @Date: 2022/7/17 22:00
 * @Version 1.0
 */
public class BM64XX_MinCostClimbingStairs {

    int totalCost = 0;

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = dp[1] = 0;
        for (int i = 2; i < cost.length; ++i) {
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length-1];
    }

}
