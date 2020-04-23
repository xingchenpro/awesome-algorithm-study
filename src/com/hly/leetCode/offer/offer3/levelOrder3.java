package com.hly.leetCode.offer.offer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/24
 * @QQ :1136513099
 * @desc : 面试题32 - III. 从上到下打印二叉树 III
 */
public class levelOrder3 {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        //保存奇数层的栈
        Stack<TreeNode> stack1 = new Stack<>();
        //保存偶数层的栈
        Stack<TreeNode> stack2 = new Stack<>();
        if (root != null)
            stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            while (!stack1.isEmpty()) {
                TreeNode tmp = stack1.pop();
                list1.add(tmp.val);
                //打印奇数层，先保存左
                if (tmp.left != null) {
                    stack2.push(tmp.left);
                }
                if (tmp.right != null) {
                    stack2.push(tmp.right);
                }
            }
            if (!list1.isEmpty()) {
                lists.add(list1);
            }
            List<Integer> list2 = new ArrayList<>();
            while (!stack2.isEmpty()) {
                TreeNode tmp = stack2.pop();
                list2.add(tmp.val);
                //打印偶数层，先保存又
                if (tmp.right != null) {
                    stack1.push(tmp.right);
                }
                if (tmp.left != null) {
                    stack1.push(tmp.left);
                }
            }
            if (!list2.isEmpty()) {
                lists.add(list2);
            }
        }
        return lists;
    }
}
