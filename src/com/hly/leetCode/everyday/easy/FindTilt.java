package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/9
 * @desc : 563. 二叉树的坡度
 * https://leetcode-cn.com/problems/binary-tree-tilt/
 */
public class FindTilt {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }

    int tilt = 0;

    private int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }

}
