package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/22
 * @desc :235. 二叉搜索树的最近公共祖先
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestor {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //从根节点开始遍历树
    //如果节点 pp 和节点 qq 都在右子树上，那么以右孩子为根节点继续 1 的操作
    //如果节点 pp 和节点 qq 都在左子树上，那么以左孩子为根节点继续 1 的操作
    //如果条件 2 和条件 3 都不成立，这就意味着我们已经找到节 pp 和节点 qq 的 LCA 了
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //根节点的值
        int parentNode = root.val;
        //左节点
        int leftNode = p.val;
        //右节点
        int rightNode = q.val;
        //都大于根节点，在右边找
        if (leftNode > parentNode && rightNode > parentNode) {
            return lowestCommonAncestor(root.right, p, q);
        }
        //都小于根，在左边找
        if (leftNode < parentNode && rightNode < parentNode) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

}
