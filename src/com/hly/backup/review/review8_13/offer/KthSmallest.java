package com.hly.backup.review.review8_13.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :54、二叉搜索树第 k 大的节点
 */
public class KthSmallest {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
    TreeNode res;
    int index = 1;

    public TreeNode kthSmallest(TreeNode root, int k) {
        InOrder(root, k);
        return res;
    }
    public void InOrder(TreeNode root, int k) {
        if (root == null)
            return;
        InOrder(root.left, k);
        if (index++ == k)
            res = root;
        InOrder(root.right, k);
    }
}
