package com.leex.alg.JZ;

import com.leex.alg.TreeNode;

/**
 * @title: JZ27_MirrorTree
 * @Author LeeX
 * @Date: 2022/7/28 23:03
 * @Version 1.0
 */
public class JZ27xx_MirrorTree {


    /**
     * 这个 return 是有作用的
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);

        root.right = left;
        root.left = right;
        return root;
    }


    /**
     * return 之后 只有最后一个被接受了，即之前 return的好像没啥用。
     * @param root
     * @return
     */
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode leftNode = root.left;
        root.left = root.right;
        root.right = leftNode;
        mirrorTree2(root.left);
        mirrorTree2(root.right);
        return root;
    }

}
