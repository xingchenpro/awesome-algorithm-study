package com.hly.leetCode.offer2;

import java.util.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/11
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

    //解法1：层次遍历
    public int maxDepth1(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            Queue<TreeNode> tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null)
                    tmp.add(node.left);
                if (node.right != null)
                    tmp.add(node.right);
            }
            queue = tmp;
            res++;

        }
        return res;
    }

    //解法2：深度遍历DFS
    public int maxDepth2(TreeNode root) {

        return root == null ? 0 : Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("1".equals(iterator.next())) {
                iterator.remove();
                list.add("4");
                list.remove("1");
            }
        }
    }

}
