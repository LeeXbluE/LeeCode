package com.leex.alg.BM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L452_XX_FindMinArrowShots {

    public static void main(String[] args) {
        L452_XX_FindMinArrowShots a = new L452_XX_FindMinArrowShots();
        a.findMinArrowShots(new int[][]{{-2147483646,-2147483645}, {2147483646,2147483647}});
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (p1, p2) -> p1[1] < p2[1] ? -1 : 1);

//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
        Set<int[]> breakPoint = new HashSet<>();

        int jianshu = 0;
        int r = points[0][1];
        while (breakPoint.size() < points.length) {
            for (int i = 0; i < points.length; i++) {
                int[] point = points[i];
                if (breakPoint.contains(points[i])) {
                    continue;
                }
                if (points[i][0] <= r) {
                    breakPoint.add(points[i]);
                } else {
                    r = points[i][1];
                    break;
                }

            }
            jianshu++;
        }
        return jianshu;
    }


/*    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int cnt = 1, end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }*/
}
