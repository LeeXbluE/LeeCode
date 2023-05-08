package com.leex.alg.BM;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L392_IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        t.indexOf(s.indexOf(0),2);
        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();
        int flag =0;
        for (char tChar : tChars) {
            if (tChar == sChars[flag]) {

                flag++;
                if (flag == sChars.length) {
                    return true;
                }
            }
        }
        return false;
    }

}
