package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/26
 * @desc : 111. 二叉树的最小深度
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class MinDepth {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //最小深度
    //与最大深度的区别在于，除了改为 Math.min；还需要判断是否为空
    //最大深度递归到底必然是叶子节点,最小深度返回的最小值并非是到达叶子节点的最小值，[1,3] 中的 3 不是叶子节点，按最大深度的解法只改变 Math.max 是错误的
    //       1
    //    /     \
    //   1       3
    //  / \      /
    // 4   5    6
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right == null)
            return minDepth(root.left) + 1;
        if (root.left == null && root.right != null)
            return minDepth(root.right) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    //最大深度
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), minDepth(root.right)) + 1;
    }
}
