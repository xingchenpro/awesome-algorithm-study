package com.hly.leetCode.everyday.easy;

import sun.reflect.generics.tree.Tree;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/15
 * @desc :226. 翻转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class InvertTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //解法1：递归
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
