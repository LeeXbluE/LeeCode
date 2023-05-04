package com.leex.alg.BM;

import java.util.Arrays;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L215_FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
