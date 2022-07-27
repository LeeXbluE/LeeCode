package com.leex.alg.JZ;

import com.leex.alg.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @title: JZ32_LevelOrder2
 * @Author LeeX
 * @Date: 2022/7/27 22:24
 * @Version 1.0
 */
public class JZ32_LevelOrder2 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return null;


        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        list.add(new TreeNode(-1));
        int index = 0;
        boolean flag = true;
        while(flag){
            if(list.size()>2 &&  list.get(index).val == -1 &&  list.get(index-1).val==-1){
                flag = false;
            }

            if(Objects.nonNull(list.get(index).left)){
                list.add(list.get(index).left);
            }
            if(Objects.nonNull(list.get(index).right)){
                list.add(list.get(index).right);
            }
            if(list.get(index).val == -1){
                list.add(new TreeNode(-1));
            }
            index++;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        for(TreeNode item : list ){
            if(item.val == -1){
                res.add(line);
                line = new ArrayList<>();
                continue;
            }
            line.add(item.val);
        }
        return res;
    }



    public static TreeNode convert(Integer[] array) {
        int floor = 0, count = 0;
        TreeNode[] treeNodes = new TreeNode[array.length];
        while (array != null && count < array.length) {
            int start = (int) Math.pow(2, floor) - 1;
            int end = (int) Math.pow(2, floor + 1) - 1;
            if (end > array.length) {
                end = array.length;
            }
            for (int i = start; i < end; i++) {
                if (array[i] != null) {
                    treeNodes[i] = new TreeNode(array[i]);
                } else {
                    treeNodes[i] = null;
                }
                if (i > 0) {
                    int parent = (i - 1) / 2;
                    if (parent >= 0) {
                        TreeNode pNode = treeNodes[parent];
                        if (pNode != null) {
                            if (i % 2 == 1) {
                                pNode.left = treeNodes[i];
                            } else {
                                pNode.right = treeNodes[i];
                            }
                        }
                    }
                }
                count++;
            }
            floor++;
        }
        return treeNodes[0];
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2,3};
        TreeNode root = convert(array);
        JZ32_LevelOrder2.levelOrder(root);

    }
}
