package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @title: BM55XX_permute
 * @Author LeeX
 * @Date: 2022/7/14 21:55
 * @Version 1.0
 */
public class BM55XX_Permute {
/*    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // 存一种排列
        LinkedList<Integer> list = new LinkedList<>();
        // 递归进行
        backTrack(num,list);
        return res;
    }

    public void backTrack(int[] num, LinkedList<Integer> list){
        // 当list中的长度等于数组的长度，则证明此时已经找到一种排列了
        if(list.size() == num.length){
            // add进返回结果集中
            res.add(new ArrayList<>(list));
            return;
        }
        // 遍历num数组
        for(int i = 0; i < num.length; i++){
            // 若当前位置中的数已经添加过了则跳过
            if(list.contains(num[i]))
                continue;
            // 选择该数
            list.add(num[i]);
            // 继续寻找
            backTrack(num,list);
            // 撤销最后一个
            list.removeLast();
        }
    }*/

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> item = new ArrayList<>();
        backTrack(num, res, item);
        return res;
    }

    public void backTrack(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item) {
        if (item.size() == num.length) {
            res.add(new ArrayList<>(item));
            return;
        }
        for (int i = 0; i < num.length; ++i) {
            if (item.contains(num[i])) {
                continue;
            }
            item.add(num[i]);
            backTrack(num, res, item);
            item.remove(item.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3};
        BM55XX_Permute t = new BM55XX_Permute();
        ArrayList<ArrayList<Integer>> permute = t.permute(num);
        System.out.println(permute);
    }
}
