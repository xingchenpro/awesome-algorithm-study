package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/26
 * @desc : 110. 平衡二叉树
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class IsBalanced {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //方法1：自顶向下的递归
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        //深度差绝对值超过 1 ，不平衡
        if (Math.abs(depth(root.left) - depth(root.right)) > 1)
            return false;
        //递归左右子树
        return isBalanced(root.left) && isBalanced(root.right);
        //上面两步合并在一起的写法
        //return Math.abs(depth(root.left) - depth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    //树的最大高度
    public int depth(TreeNode node) {
        return node == null ? 0 : Math.max(depth(node.left), depth(node.right)) + 1;
    }

}
