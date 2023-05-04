package com.leex.alg.BM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L347_TopKFrequent {

/*    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> a = new HashSet(nums.length);
        int[] result = new int[k];
        int flag = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (a.contains(nums[i])) {
                continue;
            } else {
                a.add(nums[i]);
                result[flag++] = nums[i];
            }
            if (flag == k) {
                return result;
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        L347_TopKFrequent a = new L347_TopKFrequent();
        a.topKFrequent(new int[]{1, 2}, 2);
    }

    /**
     * 桶排序
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFrequentMap = new HashMap<>();
        for (int num : nums) {
            numFrequentMap.put(num, numFrequentMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(numFrequentMap.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }

}
