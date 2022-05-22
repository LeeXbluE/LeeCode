package com.leex.alg.BM;

/**
 * @title: BM16_无重复数字的升序数组的二分查找
 * @Author LeeX
 * @Date: 2022/5/21 19:21
 * @Version 1.0
 */
public class BM16_BinarySearch {
    /*
    无重复数字的升序数组的二分查找
     */

    public static int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l <= r) {    // 别忘了 =
            mid = (l + r) >> 1;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}
