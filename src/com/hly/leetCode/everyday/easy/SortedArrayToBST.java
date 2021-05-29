package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/6/25
 * @desc : 108. 将有序数组转换为二叉搜索树
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class SortedArrayToBST {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int[] nums;

    //从数组 nums 中从左到右创建 BST
    public TreeNode helper(int left, int right) {
        //叶子节点不存在子节点，返回 null
        if (left > right)
            return null;
        //找出中间元素，防止溢出
        int p = (right - left) / 2 + left;
        //创建根节点
        TreeNode root = new TreeNode(nums[p]);
        //以索引 left 到 p-1 创建左子树
        root.left = helper(left, p - 1);
        //以 p+1 到 right 创建右子树
        root.right = helper(p + 1, right);
        return root;
    }

    //二叉搜索树的中序遍历是一个升序序列,将有序数组作为输入，可以把该问题看做 根据中序遍历序列创建二叉搜索树。
    //[-10,-3,0,5,9]
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }
}
