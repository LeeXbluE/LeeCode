package com.leex.alg.BM;

import cn.hutool.core.util.HashUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L345_ReverseVowels {

    public static void main(String[] args) {
        L345_ReverseVowels a = new L345_ReverseVowels();
        a.reverseVowels("ss");
    }


    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        s = "hello";

        int left = 0;
        int right = s.length() - 1;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] result = new char[s.length()];
        while (left <= right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if (!vowels.contains(cl)) {
                result[left++] = cl;
            } else if (!vowels.contains(cr)) {
                result[right--] = cr;
            } else {
                result[left++] = cr;
                result[right--] = cl;
            }
        }
        return new String(result);
    }
}
