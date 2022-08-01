package com.leex.alg.JZ;

import com.leex.alg.TreeNode;

import java.util.Objects;

/**
 * @title: JZ26xx_IsSubStructure
 * @Author LeeX
 * @Date: 2022/7/28 22:08
 * @Version 1.0
 */
public class JZ26xx_IsSubStructure {

    /**
     * 1. 可用 前序和中序唯一确定一棵树来做。  性能差点。
     * 2. 前序遍历树，等值是额外去判断是否同一棵
     *
     * @param A
     * @param B
     * @return
     */

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
/*        if (A.val == B.val) {
            return judge(A, B);
        }*/
        return judge(A, B)||isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }


    boolean judge(TreeNode A, TreeNode B) {
        if (Objects.nonNull(A) && Objects.nonNull(B)) {
            if (A.val == B.val) {
                judge(A.left, B.left);
                judge(A.right, B.right);
            }
            return true;
        } else {
            return false;
        }
    }
}
