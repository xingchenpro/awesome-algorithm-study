package com.hly.leetCode.offer2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/9
 * @QQ :1136513099
 * @desc :
 */
public class MirrorTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //解法1：递归
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    //解法2：迭代
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null || cur.right != null) {
                TreeNode t = cur.left;
                cur.left = cur.right;
                cur.right = t;
            }
            if (cur.left != null)
                queue.offer(cur.left);
            if (cur.right != null)
                queue.offer(cur.right);
        }
        return root;
    }

}
