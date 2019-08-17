package com.hly.offer.chapter4;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/17
 * @QQ :1136513099
 * @desc :36.把二叉搜索树转化成排序的双向链表
 */
public class Convert {

    private TreeNode head;
    private TreeNode pre;

    //树节点
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        pre = root.left;
        if (pre != null)
            pre.right = root;
        pre = root;
        if (head == null)
            head = pre;
        inOrder(root.right);
    }

    public TreeNode convert(TreeNode root) {
        inOrder(root);
        return head;
    }
}
