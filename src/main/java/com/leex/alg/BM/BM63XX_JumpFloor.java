package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * @title: BM63XX_JumpFloor
 * @Author LeeX
 * @Date: 2022/7/17 19:18
 * @Version 1.0
 */
public class BM63XX_JumpFloor {

    int count=0;
    public int jumpFloor(int target) {
        test(target);
        return count;
    }
    public void test(int rest){
        if(rest == 0){
            count++;
            return;
        }else if(rest<0){
            return;
        }
        test(rest-1);
        test(rest-2);
    }

    /**
     * 题目分析，假设f[i]表示在第i个台阶上可能的方法数。逆向思维。如果我从第n个台阶进行下台阶，下一步有2中可能，一种走到第n-1个台阶，一种是走到第n-2个台阶。所以f[n] = f[n-1] + f[n-2]. 那么初始条件了，f[0] = f[1] = 1。 所以就变成了：f[n] = f[n-1] + f[n-2], 初始值f[0]=1, f[1]=1，目标求f[n]
     * @param target
     * @return
     */
    public int jumpFloor2(int target) {
        if(target<=1){
            return 1;
        }
        return jumpFloor2(target-1)+jumpFloor2(target-2);
    }

    /**
     * 动态规划
     * @param number
     * @return
     */
    int jumpFloor3(int number) {
        int[] dp = new int[50];
        Arrays.fill(dp,0);
        dp[0] = dp[1] = 1;//初始状态
        for (int i=2; i<=number; ++i) {
            dp[i] = dp[i-1] + dp[i-2];//状态转移方程
        }
        return dp[number];
    }

    public static void main(String[] args) {
        BM63XX_JumpFloor s = new BM63XX_JumpFloor();

        System.out.println(s.jumpFloor(7));
    }
}

