package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L406_XX_ReconstructQueue {

    public static void main(String[] args) {

        L406_XX_ReconstructQueue a = new L406_XX_ReconstructQueue();
        a.reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});

    }

    public int[][] reconstructQueue(int[][] people) {
        if (people.length == 0) {
            return people;
        }
        Arrays.sort(people, (o1, o2) -> {
            int res = o2[0] - o1[0];
            if (res == 0) {
                res = o1[1] - o2[1];
            }
            return res;
        });
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }
        return queue.toArray(new int[queue.size()][]);
    }



    /*public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person2[0] - person1[0];
                } else {
                    return person1[1] - person2[1];
                }
            }
        });
        List<int[]> ans = new ArrayList<int[]>();
        for (int[] person : people) {
            ans.add(person[1], person);
        }
        return ans.toArray(new int[ans.size()][]);
    }*/
}
