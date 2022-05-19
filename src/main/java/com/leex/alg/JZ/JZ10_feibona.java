package com.leex.alg.JZ;

import org.junit.Test;

/**
 * @title: com.leex.agl.JZ.JZ10_feibona
 * @Author LeeX
 * @Date: 2022/2/13 21:34
 * @Version 1.0
 */
public class JZ10_feibona {
    //JZ10
    int feibo(int n){
        if(n==1||n==2) return 1;
        else return feibo(n-1)+feibo(n-2);
    }

    @Test
    public void test(){
        int x = feibo(4);
        System.out.println(x);
    }
}
