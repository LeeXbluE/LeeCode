package com.leex.alg.JZ;

/**
 * @title: JZ58_ReverseLeftWords
 * @Author LeeX
 * @Date: 2022/7/23 20:55
 * @Version 1.0
 */
public class JZ58_ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        StringBuilder result = new StringBuilder();
        result.append(s.substring(n,s.length()));
        result.append(s.substring(0,n));
        return result.toString();
    }
}
