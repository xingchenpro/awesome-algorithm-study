package com.stardust.offer;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/20
 * @desc : 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 */
public class LevelOrderIII {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    //双端队列
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                //result 的长度判断当前是偶数层，还是奇数层。偶数层，从队列的尾部往前逆序放
                if (result.size() % 2 == 0) {
                    list.addLast(curNode.val);
                } else {
                    //奇数层，从队列的前面开始按顺序放
                    list.addFirst(curNode.val);
                }
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            result.add(new ArrayList<>(list));
        }
        return result;
    }


    //两个栈
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //保存奇数层节点
        Stack<TreeNode> stack1 = new Stack<>();
        //保存偶数层节点
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            while (!stack1.isEmpty()) {
                TreeNode curNode = stack1.pop();
                //打印奇数层，但顺序添加
                list1.add(curNode.val);
                //保存偶数层，左边的节点先进栈，后出
                if (curNode.left != null) {
                    stack2.push(curNode.left);
                }
                //保存偶数层，右边的节点后进栈，先出
                if (curNode.right != null) {
                    stack2.push(curNode.right);
                }
            }

            result.add(new ArrayList<>(list1));

            //偶数层
            List<Integer> list2 = new ArrayList<>();
            while (!stack2.isEmpty()) {
                TreeNode curNode = stack2.pop();
                //打印偶数层，之前是左边的节点先进栈，所以现在是右边的出栈，先打印右边的节点
                list2.add(curNode.val);
                //保存奇数层，右边的节点先入栈，所以左边的节点先出栈，先打印
                if (curNode.right != null) {
                    stack1.push(curNode.right);
                }
                //左边的节点后入栈，先打印
                if (curNode.left != null) {
                    stack1.push(curNode.left);
                }
            }
            if (!list2.isEmpty()) {
                result.add(new ArrayList<>(list2));
            }

        }
        return result;
    }


}
