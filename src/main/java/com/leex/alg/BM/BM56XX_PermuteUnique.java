package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @title: BM56XX_PermuteUnique
 * @Author LeeX
 * @Date: 2022/7/16 22:34
 * @Version 1.0
 */
public class BM56XX_PermuteUnique {

    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> item = new ArrayList<>();
        boolean[] vis = new boolean[num.length];
        Arrays.fill(vis, false);
        trackBack(num, res, item, vis);
        return res;
    }

    public void trackBack(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, boolean[] vis) {
        if (item.size() == num.length) {
            res.add(new ArrayList<>(item));
            return;
        }

        for (int i = 0; i < num.length; ++i) {
            if (vis[i]) {
                continue;
            }
            /*
            我们需要保证重复字符只会被使用一次, 那么我们可以先对原字符串排序, 这样可以保证相同的字符都相邻, 要保证重复字符只被使用一次, 我们规定每次加入的字符一定是它在重复字符集合里从左往右第一个没用被访问的字符
             */
            if (i > 0 && num[i - 1] == num[i] && !vis[i - 1]) { //注 !vis[i-1] 为了确保在重复数的头的时候不continue
                continue;
            }
            item.add(num[i]);
            vis[i] = true;
            trackBack(num, res, item, vis);
            item.remove(item.size() - 1);
            vis[i] = false;
        }
    }


    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 2};
        BM56XX_PermuteUnique t = new BM56XX_PermuteUnique();
        ArrayList<ArrayList<Integer>> permute = t.permuteUnique(num);
        System.out.println(permute);
    }
}
