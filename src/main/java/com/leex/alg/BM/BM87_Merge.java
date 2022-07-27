package com.leex.alg.BM;

/**
 * @title: BM87_Merge
 * @Author LeeX
 * @Date: 2022/7/21 22:57
 * @Version 1.0
 */
public class BM87_Merge {

    //注：原本有序
    public void merge(int A[], int m, int B[], int n) {
        int index = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (A[m] > B[n]) {
                A[index] = A[m];
                m--;
            } else {
                A[index] = B[n];
                n--;
            }
            index--;
        }
        if (m < 0) {
            while (n >= 0) {
                A[index] = B[n];
                index--;
                n--;
            }
        }
        for (int i : A) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{4,5,6,0,0,0,0,0,0,0,0,0,0};
        int[] B = new int[]{1,2,3};
        BM87_Merge a = new BM87_Merge();
        a.merge(A,3,B,3);
    }
}
