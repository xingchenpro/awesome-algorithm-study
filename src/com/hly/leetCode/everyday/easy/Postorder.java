package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/15
 * @desc : TD 590. N叉树的后序遍历
 *  https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 */
public class Postorder {

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            res.addFirst(node.val);
            stack.addAll(node.children);
        }
        return res;

    }
}
