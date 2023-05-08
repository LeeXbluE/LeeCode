package com.leex.alg.BM;

import java.util.Arrays;

/**
 * @author 李翔
 * @date 2023/5/5
 * @description
 */
public class L605_CanPlaceFlowers {

    public static void main(String[] args) {
        L605_CanPlaceFlowers a = new L605_CanPlaceFlowers();
        boolean b = a.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2);
        System.out.println(b);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int[] flowerbedCopy = new int[flowerbed.length + 2];
        flowerbedCopy[0] = 0;
        flowerbedCopy[flowerbedCopy.length - 1] = 0;
        System.arraycopy(flowerbed, 0, flowerbedCopy, 1, flowerbed.length);
        for (int i = 0; i < flowerbedCopy.length; ) {
            if (flowerbedCopy.length < i + 3) {
                return false;
            }
            if (flowerbedCopy[i] == 0 && flowerbedCopy[i + 1] == 0 && flowerbedCopy[i + 2] == 0) {
                n--;
                i+=2;
                if (n == 0) {
                    return true;
                }
                continue;
            }
            i++;
        }
        return false;
    }


}
