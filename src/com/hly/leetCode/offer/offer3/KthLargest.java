package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题54. 二叉搜索树的第k大节点
 * 二叉搜索树的中序遍历为递增序列
 * 第 k 大，右根左，第 k 小，左根右
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

    int res = -1;
    int index = 0;

    public int kthLargest(TreeNode root, int k) {
        mid(root, k);
        return res;
    }

    public void mid(TreeNode root, int k) {

        if (root != null) {
            mid(root.right, k);
            //这是++
            if (++index == k) {
                res = root.val;
                return;
            }
            mid(root.left, k);
        }
    }
}
