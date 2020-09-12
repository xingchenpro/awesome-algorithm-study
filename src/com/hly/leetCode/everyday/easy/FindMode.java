package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/12
 * @desc :
 */
public class FindMode {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private List<Integer> result = new ArrayList<>();
    private TreeNode pre;
    private int max = 0;
    private int cur = 1;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        inorder(root);
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        return a;
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (pre != null) {
            if (pre.val == root.val) {
                cur++;
            } else {
                cur = 1;
            }
        }
        if (cur == max) {
            result.add(root.val);
        }
        if (cur > max) {
            result.clear();
            result.add(root.val);
            max = cur;
        }
        pre = root;
        inorder(root.right);


    }


}
