package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/2
 * @desc : 543. 二叉树的直径
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int res ;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 1;
        depth(root);
        return res-1;
    }

    public int depth(TreeNode node){
        if(node==null)
            return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        res = Math.max(res,L+R+1);
        return Math.max(L,R)+1;

    }


    public static void main(String[] args) {


    }
}
