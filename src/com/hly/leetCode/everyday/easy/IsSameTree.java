package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/24
 * @QQ :1136513099
 * @desc : 100. 相同的树
 * https://leetcode-cn.com/problems/same-tree/
 */
public class IsSameTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        //有其中之一为 Null，则为 false
        if(p==null||q==null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
