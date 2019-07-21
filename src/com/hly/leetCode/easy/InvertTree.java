package com.hly.leetCode.easy;
import java.util.*;
/**
 * @author :hly
 * @github :https://github.com/huangliangyun
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

    //递归
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        } else {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }

    //迭代
    public static TreeNode invertTree2(TreeNode root) {
        if (root == null) return root;
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode p = root;
        queue.offer(p);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null || cur.right != null) {
                TreeNode tmp = cur.left;
                cur.left = cur.right;
                cur.right = tmp;
                if (cur.left != null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println("");
    }


}
