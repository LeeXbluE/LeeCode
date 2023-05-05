package com.leex.alg.BM;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L435_XX_EraseOverlapIntervals {

    public static void main(String[] args) {
        L435_XX_EraseOverlapIntervals a = new L435_XX_EraseOverlapIntervals();
        a.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22},{1, 11}, {2, 12}});
    }


    //想不明白的点： 因为区间集合是乱的，不容易确定该方案的正确性。

    /**
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
//        Arrays.sort(intervals, (o1, o2) -> o1[1] < o2[1] ? -1 : 0);  这样写是错的

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });

        int end = intervals[0][1];
        int cnt = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length-cnt;
    }
}
