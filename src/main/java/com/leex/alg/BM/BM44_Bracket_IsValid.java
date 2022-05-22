package com.leex.alg.BM;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @title: BM44_Bracket_IsValid
 * @Author LeeX
 * @Date: 2022/5/21 23:08
 * @Version 1.0
 */
public class BM44_Bracket_IsValid {

    Stack<String> stack = new Stack<>();
    Map<String, String> symbolMap = new HashMap<>(16);

    public Map<String, String> getSymbolMap() {
        symbolMap.put("}", "{");
        symbolMap.put("]", "[");
        symbolMap.put(")", "(");
        return symbolMap;
    }

    public boolean isValid(String s) {
        symbolMap = getSymbolMap();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!stack.empty() && symbolMap.containsKey(String.valueOf(c)) && symbolMap.get(String.valueOf(c)).equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String t = "()[]{}";
        BM44_Bracket_IsValid s = new BM44_Bracket_IsValid();
        System.out.println(s.isValid(t));
    }
}
