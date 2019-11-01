package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/6
 * @QQ :1136513099
 * @desc :783. 二叉搜索树结点最小距离
 */
/**
 * 给定一个二叉搜索树的根结点 root, 返回树中任意两节点的差的最小值。
 * (把static去掉，LeetCode提交才正确)
 */
public class MinDiffInBST {
    private static int min = Integer.MAX_VALUE;
    private static int pre = -999;

   static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public static int minDiffInBST(TreeNode root) {
        min(root);
        return min;
    }

    public static void min(TreeNode root){
        if (root!=null){
            if(root.left!=null){
                min(root.left);
            }
            if(root.val - pre < min) min = root.val - pre;
            pre = root.val;
            if(root.right!=null){
                min(root.right);
            }
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(minDiffInBST(root));
    }
}