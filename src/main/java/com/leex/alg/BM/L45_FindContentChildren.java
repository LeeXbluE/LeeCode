package com.leex.alg.BM;

import java.util.Arrays;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L45_FindContentChildren {


    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; ) {
            int size = g[i];
            if (size <= s[j]) {
                i++;
                res++;
            }
            j++;
        }
        return res;
    }

}
