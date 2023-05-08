package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L763_XX_PartitionLabels {

    public static void main(String[] args) {
        L763_XX_PartitionLabels a = new L763_XX_PartitionLabels();
        List<Integer> dccbd = a.partitionLabels("dccbd");
        System.out.println(dccbd);
    }

    public List<Integer> partitionLabels(String s) {
        HashSet<Character> set = new HashSet();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                int lastIndex = getLastIndex(set, s, i, c);
                res.add(lastIndex - i + 1);
            }

        }
        return res;
    }

    public int getLastIndex(HashSet<Character> set, String s, int fromIndex, char c) {
        set.add(c);
        int index = s.lastIndexOf(c);
        int lastIndex = index;
        if (index != -1) {
            for (int i = fromIndex; i < index; i++) {
                if (set.contains(s.charAt(i))) {
                    continue;
                }
                int flag = getLastIndex(set, s, i, s.charAt(i));
                if (flag > lastIndex) {
                    lastIndex = flag;
                }
            }
        }
        return lastIndex;
    }

}