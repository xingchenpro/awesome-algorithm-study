package com.hly.leetCode.algorithms2018.tree;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/28
 * @QQ :1136513099
 * @desc :
 */
public class KthSmallest {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    int res = 0;
    int index = 1;
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root, k);
        return res;
    }

    private void Inorder(TreeNode node, int k) {
        if (node == null)
            return;
        Inorder(node.left, k);
        if (index++ == k)
            res = node.val;
        Inorder(node.right, k);
    }
}
