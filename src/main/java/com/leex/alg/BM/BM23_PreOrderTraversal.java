package com.leex.alg.BM;
import com.leex.alg.TreeNode;

/**
 * @title: BM23_PreOrderTraversal
 * @Author LeeX
 * @Date: 2022/5/23 23:11
 * @Version 1.0
 */
public class BM23_PreOrderTraversal {

    /*
    1. 递归
    2. 非递归
     */
    public int[] preorderTraversal (TreeNode root) {
        if(root!=null){
            System.out.println(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return null;
    }

}
