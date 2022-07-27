package com.leex.alg.JZ;

import com.leex.alg.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @title: JZ32_LevelOrder
 * @Author LeeX
 * @Date: 2022/7/27 21:58
 * @Version 1.0
 */
public class JZ32_LevelOrder {


    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];


        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        int index = 0;
        while(index < list.size()){
            if(Objects.nonNull(list.get(index).left)){
                list.add(list.get(index).left);
            }
            if(Objects.nonNull(list.get(index).right)){
                list.add(list.get(index).right);
            }
            index++;
        }

        return list.stream().mapToInt(t->t.val).toArray();
    }
}
