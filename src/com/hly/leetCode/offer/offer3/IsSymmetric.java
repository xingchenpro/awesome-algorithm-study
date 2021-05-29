package com.hly.leetCode.offer.offer3;

import sun.reflect.generics.tree.Tree;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题28. 对称的二叉树
 */
public class IsSymmetric {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        //为空就是对称
        if (root == null)
            return true;
        //判断左右子树
        return judge(root.left, root.right);
    }

    public boolean judge(TreeNode left, TreeNode right) {

        //左子树，右子树都为空，对称
        if (left == null && right == null)
            return true;
        //左右有一个为空，不对称
        if (left == null || right == null)
            return false;
        //左的值不等于右的值
        if (left.val != right.val)
            return false;
        //判断左的左，右的右，左的右，右的左上方对称
        return judge(left.left, right.right) && judge(left.right, right.left);
    }
}
