package com.hly.backup.offer.chapter6;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :54、二叉搜索树第 k 大的节点
 */
public class KthSmallest {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode res ;
    int index =0;
    public TreeNode kthSmallest(TreeNode root,int k){
        Inorder(root,k);
        return res;
    }

    public void Inorder(TreeNode node,int k){
        if(node==null||index>=k)
            return;
        Inorder(node.left,k);
        if(index++==k)
            res = node;
        Inorder(node.right,k);
    }

































}
