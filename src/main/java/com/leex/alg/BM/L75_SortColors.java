package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L75_SortColors {

    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int p = 0;
        while (p <= j) {
            if (nums[p] > 1) {
                swap(nums,p,j--);    // 这里p不动
            } else if (nums[p] < 1) {
                swap(nums, i++, p++);  // p要动   ，原因应该是从左往右遍历。
            } else {
                p++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
