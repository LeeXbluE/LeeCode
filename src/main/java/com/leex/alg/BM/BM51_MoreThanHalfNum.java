package com.leex.alg.BM;

import java.util.Objects;

/**
 * @title: BM51_MoreThanHalfNum
 * @Author LeeX
 * @Date: 2022/5/23 21:34
 * @Version 1.0
 */
public class BM51_MoreThanHalfNum {

    /* 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    1. hash表
    2. Boyer-Moore ***投票算法***
    3. 排序（中间位就是）

     */
    public int moreThanHalfNum2(int [] array) {
        int candidate = array[0];
        int count =1;
        for(int i=1;i<array.length;++i){
            if(Objects.equals(array[i],candidate)){
                count++;
            }else{
                count--;
            }
            if(Objects.equals(count,0)){
                candidate = array[i+1];
            }
        }
        return candidate;
    }

}
