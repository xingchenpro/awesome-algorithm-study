package com.hly.leetCode.everyday.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :hly
 *
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

    //保存众数，出现频率最高的数
    private List<Integer> result = new ArrayList<>();
    private TreeNode pre;
    //保存最大出现频率
    private int max = 0;
    //保存当前数出现频率
    private int cur = 1;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        inorder(root);
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    //中序遍历，左中右

    /**
     * 1
        \
         2
        /
       2
     * @param root
     */
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
        //当前数出现次数大于过往的数的出现次数
        if (cur > max) {
            result.clear();
            result.add(root.val);
            max = cur;
        }
        pre = root;
        inorder(root.right);
    }
}
