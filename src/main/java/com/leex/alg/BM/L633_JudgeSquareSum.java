package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L633_JudgeSquareSum {

    public static void main(String[] args) {
        L633_JudgeSquareSum a = new L633_JudgeSquareSum();
        a.judgeSquareSum(4);
    }

    /**
     * https://leetcode.cn/problems/sum-of-square-numbers/solutions/748260/shuang-zhi-zhen-de-ben-zhi-er-wei-ju-zhe-ebn3/
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        c = 2;
        int right = (int) Math.sqrt(c);
        int left = 0;
        int length = right + 1;
        for (int i = 1; i <= length; i++) {
            int pow2 = (int) (Math.pow(left, 2) + Math.pow(right, 2));
            if (pow2 < c) {
                left++;
            } else if (pow2 > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
