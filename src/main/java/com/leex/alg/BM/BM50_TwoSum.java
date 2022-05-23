package com.leex.alg.BM;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: BM_TwoSum
 * @Author LeeX
 * @Date: 2022/5/23 21:18
 * @Version 1.0
 */
public class BM50_TwoSum {

    /*（注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）
    1. HashMap
    2. 暴力
     */
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;++i){
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }else{
                map.put(numbers[i],i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
