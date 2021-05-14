package com.stardust.offer;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/14
 * @desc : 27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class MirrorTree {

    private static class TreeNode {
        int val;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }

        TreeNode right;
    }

    //递归
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    //迭代
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null || cur.right != null) {
                TreeNode t = cur.left;
                cur.left = cur.right;
                cur.right = t;
            }

            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        return root;
    }


    public static void main(String[] args) {

    }

}
