package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/26
 * @desc : 112. 路径总和/
 * https://leetcode-cn.com/problems/path-sum/
 */
public class HasPathSum {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        //不为空时,sum 减去当前节点的值
        sum -= root.val;
        //左右都为空，说明是叶子节点,此时 sum 应该为 0
        if (root.left == null && root.right == null)
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
