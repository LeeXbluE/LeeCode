package com.leex.alg.BM;

/**
 * @title: BM86_LargeNumber
 * @Author LeeX
 * @Date: 2022/7/20 22:31
 * @Version 1.0
 */
public class BM86_LargeNumber {

    public String solve(String s, String t) {

        if (s == null || t == null) {
            return "";
        }
        if (s.equals("")) {
            s = "0";
        }
        if (t.equals("")) {
            t = "0";
        }
        int len1 = s.length();
        int len2 = t.length();
        // 首先要保证两个数的位数要保持一致
        while (len1 < len2) {
            s = "0" + s;
            len1++;
        }
        while (len1 > len2) {
            t = "0" + t;
            len2++;
        }

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s_re = s1.reverse();

        StringBuilder t1 = new StringBuilder(t);
        StringBuilder t_re = t1.reverse();

        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (i = 0; i < Math.min(s1.length(), t1.length()); ++i) {
            int c = Integer.parseInt(String.valueOf(t_re.charAt(i))) + Integer.parseInt(String.valueOf(s_re.charAt(i)));
            if (carry != 0) {
                carry--;
                c += 1;
            }
            if (c >= 10) {
                carry++;
                c -= 10;
            }
            result.append(c);
        }

        if (carry == 1) {
            result.append(1);
        }


        return result.reverse().toString();
    }

    public static void main(String[] args) {
        BM86_LargeNumber a = new BM86_LargeNumber();
        System.out.println(a.solve("99", "1"));
    }

}
