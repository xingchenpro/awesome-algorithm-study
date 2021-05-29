package com.hly.leetCode.everyday;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/10
 * @QQ :1136513099
 * @desc : 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 */
public class DiameterOfBinaryTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    int max = 0;

    //遍历每一个节点,求出此节点作为根的树的深度,那么,左子树深度加右子树深度的最大值即是答案
    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            deep(root);
            return max;
        }
        return 0;

    }

    private int deep(TreeNode root) {
        if (root != null) {
            int right = deep(root.right);
            int left = deep(root.left);
            if (right + left > max) {
                max = right + left;
            }
            return Math.max(right, left) + 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("");
    }
}
