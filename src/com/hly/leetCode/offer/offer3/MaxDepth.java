package com.hly.leetCode.offer.offer3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/22
 * @QQ :1136513099
 * @desc : 面试题55 - I. 二叉树的深度
 */
public class MaxDepth {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //用一个临时队列存储下一层节点
            Queue<TreeNode> tmp = new LinkedList<>();
            //遍历这个队列
            for (TreeNode node : queue) {
                if (node.left != null) {
                    tmp.offer(node.left);
                }
                if (node.right != null) {
                    tmp.offer(node.right);
                }
            }
            //临时队列赋值给这个队列
            queue = tmp;
            depth++;
        }
        return depth;
    }
}
