package com.leex.alg.BM;

import java.util.Arrays;
import java.util.List;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L524_FindLongestWord {

    public static void main(String[] args) {
        L524_FindLongestWord a = new L524_FindLongestWord();

        System.out.println(a.findLongestWord("abce", Arrays.asList("abe","abc")));
    }

    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        int nowLength = 0;
        for (String dict : dictionary) {
            int sf = 0;
            int rf = 0;
            char[] sCopy = s.toCharArray();
            char[] dictChars = dict.toCharArray();
            while (rf < dictChars.length && sf < sCopy.length) {
                if (sCopy[sf] == dictChars[rf]) {
                    sf++;
                    rf++;
                } else {
                    sf ++;
                }
            }
            if (rf == dictChars.length && nowLength <= dictChars.length) {
                if (nowLength == rf) {
                    if (result.compareTo(new String(dictChars)) > 0) {
                        continue;
                    }
                }
                nowLength = rf;
                result = new String(dictChars);
            }
        }
        return result;
    }

}