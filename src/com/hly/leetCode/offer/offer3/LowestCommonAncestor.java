package com.hly.leetCode.offer.offer3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc :
 */
public class LowestCommonAncestor {


    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 1、p，q 一个在左子树，一个在右子树，那么当前节点即为公共祖先
     * 2、p，q 都在左子树
     * 3、p，q 都在右子树
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)
            return null;
        if(root==p||root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            //一个在左，一个在右
            return root;
        }
        if(left!=null){
            //都在左子树
            return left;
        }
        if(right!=null){
            //都在右子树
            return right;
        }
        return null;
    }




}
