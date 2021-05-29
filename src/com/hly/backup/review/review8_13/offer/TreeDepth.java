package com.hly.backup.review.review8_13.offer;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :55、二叉树的深度
 */
public class TreeDepth {


    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public int depth2(TreeNode root) {
        if(root!=null){
            int left = depth2(root.left);
            int right = depth2(root.right);
            return 1+(left>right?left:right);
        }
        return 0;
    }

    public int depth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(depth(root.left), depth(root.right));
    }


}
