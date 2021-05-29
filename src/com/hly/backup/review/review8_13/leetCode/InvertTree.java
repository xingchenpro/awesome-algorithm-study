package com.hly.backup.review.review8_13.leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc : 226. 翻转二叉树
 */
public class InvertTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public void inverse2(TreeNode root){
        if (root==null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){

            TreeNode cur = queue.poll();
            if(cur.left!=null||cur.right!=null){
                TreeNode t = cur.left;
                cur.left = cur.right;
                cur.right = t;
            }
            if(cur.left!=null)
                queue.offer(cur.left);
            if(cur.right!=null)
                queue.offer(cur.right);
        }
    }


    public void inverse(TreeNode root){

        if(root!=null){
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            inverse(root.left);
            inverse(root.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("");
    }


}
