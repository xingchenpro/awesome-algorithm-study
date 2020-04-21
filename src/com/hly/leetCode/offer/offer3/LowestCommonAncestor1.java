package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : TODO 面试题68 - I. 二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestor1 {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        //TODO 都在左子树
        if (p.val < root.val && q.val < root.val) {
            //TODO 是 return 返回
            return lowestCommonAncestor(root.left, p, q);
            //都在右子树
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

}
