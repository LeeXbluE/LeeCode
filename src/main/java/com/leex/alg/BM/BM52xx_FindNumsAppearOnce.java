package com.leex.alg.BM;

/**
 * @title: BM52_FindNumsAppearOnce
 * @Author LeeX
 * @Date: 2022/5/23 21:56
 * @Version 1.0
 */
public class BM52xx_FindNumsAppearOnce {

    /* 数组中只出现一次的两个数字
    1. hash表
    2. 异或运算
     */
    public int[] findNumsAppearOnce2(int[] array){
        //怎么划分才能让a与b完全分开，而另外的也能刚好成对在一个组呢？这是我们需要考虑的问题。
        /*
        有个隐含信息:因为有两个数字只出现一次，其他数字都至少出现过两次，那么总数是偶数。

        从异或结果里面找一位1,因为某一位上异或结果是1的话，说明要找两个数，
        一个数这位是1，另一个是0。这一位是1的分成一组，这一位是0的分成一组，最后进行组内异或，这样得到两个数就是原来的数字
         */
        int res1 = 0;
        int res2 = 0;
        int temp = 0;
        for (int j : array) {
            temp ^= j;
        }
        int k = 1;
        while ((k & temp) == 0) {
            k = k << 1;
        }

        for (int j : array) {
            if ((j & k) == 0) {
                res1 ^= j;
            } else {
                res2 ^= j;
            }
        }
        //整理次序
        if (res1 < res2)
            return new int[]{res1, res2};
        else
            return new int[]{res2, res1};
    }

    public static void main(String[] args) {
        int temp = 9;
        int k = 1;
        while ((k & temp) == 0) {
            k = k << 1;
        }
    }
}
