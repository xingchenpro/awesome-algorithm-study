package com.hly.leetCode.everyday.easy;

import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/10/7
 * @desc : 559. N叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 */
public class MaxDepth559 {

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            val = val;
        }

        public Node(int val, List<Node> children) {
            val = val;
            children = children;
        }
    }


    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int res = 1;
        for (Node child : root.children) {
            res = Math.max(res, maxDepth(child) + 1);
        }
        return res;
    }

}
