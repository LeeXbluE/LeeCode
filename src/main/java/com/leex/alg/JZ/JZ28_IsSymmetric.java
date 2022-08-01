package com.leex.alg.JZ;

import com.leex.alg.TreeNode;

import java.util.Objects;

/**
 * @title: JZ28_Issymmetric
 * @Author LeeX
 * @Date: 2022/7/28 23:13
 * @Version 1.0
 */
public class JZ28_IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(Objects.isNull(root))
            return false;
        return judge(root.left, root.right);

    }

    //判断 p与 q 值是否相等 && p的左子树与q的右子树
    private boolean judge(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && judge(p.left, q.right) && judge(p.right, q.left);
    }


}
