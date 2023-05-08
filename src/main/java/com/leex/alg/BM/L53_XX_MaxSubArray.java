package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L53_XX_MaxSubArray {

    public static void main(String[] args) {
        L53_XX_MaxSubArray a = new L53_XX_MaxSubArray();
        int i = a.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }

    /**
     * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
     *
     * https://leetcode.cn/problems/maximum-subarray/solutions/9058/dong-tai-gui-hua-fen-zhi-fa-python-dai-ma-java-dai/
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                maxSum += nums[i];
            }else

        }
        return maxSum;
    }
}
