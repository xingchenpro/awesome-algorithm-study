package com.hly.leetCode.offer.offer1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/30
 * @QQ :1136513099
 * @desc : 面试题68 - I. 二叉搜索树的最近公共祖先
 * 利用性质，左边的数比根节点小，右边的数比根节点大
 */
public class LowestCommonAncestor_68_1 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(TreeNode left) {
            this.left = left;
        }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root.val > p.val && root.val > q.val)//说明都在左子树
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);//说明都在右子树
        return root;
    }
}
