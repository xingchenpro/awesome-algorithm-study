package com.stardust.offer;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/4
 * @desc : 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * 二叉搜索树中序遍历为递增顺序
 * 返回来，二叉搜索树的中序遍历倒叙为递减序列，则可求第 k 大的节点
 */
public class KthLargest {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    int index = 0;
    int val;

    public int kthLargest(TreeNode root, int k) {
        order(root, k);
        return val;
    }

    private void order(TreeNode root, int k) {
        if (root == null)
            return;
        order(root.right, k);
        index++;
        if (index == k) {
            val = root.val;
            return;
        }
        order(root.left, k);

    }


}