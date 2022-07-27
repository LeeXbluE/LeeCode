package com.leex.alg.BM;

import sun.security.util.Length;

import java.util.List;
import java.util.Objects;

/**
 * @title: BM84_LongestCommonPrefix
 * @Author LeeX
 * @Date: 2022/7/19 23:47
 * @Version 1.0
 */
public class BM84_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length<1)
            return "";
        StringBuilder res = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; ++i) {
            int index = 0;

            for (int j = 0; j < strs[i].length(); ++j) {
                int min = Math.min(res.length(), strs[i].length());
                if (index < min && res.charAt(index) == strs[i].charAt(index)) {
                    index++;
                } else {
                    break;
                }
            }

            res.delete(index, res.length());
        }
        return res.toString();
    }

    public static void main(String[] args) {
//        String[] strs = new String[]{"abca", "abc", "abca", "abc", "abcc"};
        String[] strs = new String[]{};
        BM84_LongestCommonPrefix a = new BM84_LongestCommonPrefix();
        System.out.println(a.longestCommonPrefix(strs));
    }
}
