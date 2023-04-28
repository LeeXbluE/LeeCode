package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L88_Merge {

    public static void main(String[] args) {
        L88_Merge a = new L88_Merge();
        a.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0 && end >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[end--] = nums1[i--];
            } else {
                nums1[end--] = nums2[j--];
            }
        }
        if (i >= 0) {
            while (i>=0 && end >= 0) {
                nums1[end--] = nums1[i--];
            }
        } else {
            while (j >= 0 && end >= 0) {
                nums1[end--] = nums2[j--];
            }
        }
    }

}
