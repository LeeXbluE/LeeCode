package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L665_XX_CheckPossibility {
    public static void main(String[] args) {
        L665_XX_CheckPossibility a = new L665_XX_CheckPossibility();
        a.checkPossibility(new int[]{3,4,2,3});
    }

    //另一种方法：在出现 nums[i] < nums[i - 1] 时，需要考虑的是应该修改数组的哪个数，使得本次修改能使 i 之前的数组成为非递减数组，并且 不影响后续的操作 。优先考虑令 nums[i - 1] = nums[i]，因为如果修改 nums[i] = nums[i - 1] 的话，那么 nums[i] 这个数会变大，就有可能比 nums[i + 1] 大，从而影响了后续操作。还有一个比较特别的情况就是 nums[i] < nums[i - 2]，修改 nums[i - 1] = nums[i] 不能使数组成为非递减数组，只能修改 nums[i] = nums[i - 1]。
    /**
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] - nums[i + 1] > 0) {
                flag++;
                if ((nums.length > i + 2 && nums[i + 2] - nums[i] < 0) // 麻烦！！
                        && (i > 0 && nums[i + 1] - nums[i - 1] < 0)) {
                    return false;
                }
                if (flag > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
