package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/24
 * @QQ :1136513099
 * @desc : 101. 对称二叉树
 * https://leetcode-cn.com/problems/symmetric-tree/
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
        //根节点为空，对称
        if (root == null)
            return true;
        //根节点的左和右对称
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        //对称的两个节点都为 NULL 则对称
        if (left == null && right == null)
            return true;
        //有一个节点为空则非对称
        if (left == null || right == null)
            return false;
        //对称的两个节点不相等
        if (left.val != right.val)
            return false;
        //左子树的左和右子树的右孩子对称，左子树的右和右子树的左孩子对称
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

}
