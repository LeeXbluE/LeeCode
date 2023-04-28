package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L197_TwoSum2 {


    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }


}
