package com.leex.alg.BM;

import java.util.ArrayList;

/**
 * @title: BM58_Permutation
 * @Author LeeX
 * @Date: 2022/7/17 18:25
 * @Version 1.0
 */
public class BM58_Permutation {

    public ArrayList<String> Permutation (String str) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        trackBack(str ,res,item);
        return res;
    }

    public void trackBack(String str,ArrayList<String> res,StringBuilder item){
        if(str.length() == item.length()){
            res.add(new String(item));
        }
        for(int i=0;i<str.length();++i){
        }

    }
}
