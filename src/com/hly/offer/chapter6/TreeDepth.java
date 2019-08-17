package com.hly.offer.chapter6;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :55、二叉树的深度
 */
public class TreeDepth {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int depth(TreeNode root) {
        if(root!=null){
            int ldepth = depth(root.left);
            int rdepth = depth(root.right);
            return 1+(ldepth>rdepth?ldepth:rdepth);
        }
        return 0;
    }

    public int depth2(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(depth2(root.left), depth2(root.right));
    }
}
