package com.hly.backup.review.review8_4.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/1
 * @QQ :1136513099
 * @desc :28、对称的二叉树
 */
public class IsSymmetrical {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetrical(TreeNode root){
        if(root==null)
            return false;
        return isSymmetrical(root.left,root.right);


    }

    public boolean isSymmetrical(TreeNode t1,TreeNode t2){

        if(t1==null&&t2==null)
            return true;
        if(t1==null||t2==null)
            return false;
        return isSymmetrical(t1.left,t2.right)&&isSymmetrical(t1.right,t2.left);
    }
}
