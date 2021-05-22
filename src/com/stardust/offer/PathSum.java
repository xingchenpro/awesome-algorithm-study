package com.stardust.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/22
 * @desc : TODO *34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
public class PathSum {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    //回溯算法
    //根节点到叶子节点形成的路径的和等于目标值
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;

    }

    private void recur(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(root.left, target);
        recur(root.right, target);
        //左、右都执行完了，删除当前节点，向上回溯
        path.removeLast();
    }

    public static void main(String[] args) {


    }


}
