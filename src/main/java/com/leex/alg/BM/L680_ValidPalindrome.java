package com.leex.alg.BM;

import java.util.Objects;

/**
 * @author 李翔
 * @date 2023/4/28
 * @description
 */
public class L680_ValidPalindrome {


    /**
     * 是什么原理捏
     * @param args
     */
    public static void main(String[] args) {
        L680_ValidPalindrome a = new L680_ValidPalindrome();
        System.out.println(a.validPalindrome("baccabb"));
    }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        boolean result = true;
        while (l < r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if (Objects.equals(cl, cr)) {
                l++;
                r--;
            } else {
                result = handleSection(s, l + 1, r) || handleSection(s, l, r - 1);
                break;
            }
        }
        return result;
    }

    public boolean handleSection(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
      return true;
    }

}
