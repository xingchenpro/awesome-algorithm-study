package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/13
 * @desc : TODO *26. 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 */
public class IsSubStructure {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    //B 是 A 的子结构，A 有一个节点作为根，能够遍历出 B
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return doIsSubStructure(A, B)||isSubStructure(A.left, B) || isSubStructure(A.right, B) ;

    }

    private boolean doIsSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return doIsSubStructure(A.left, B.left) && doIsSubStructure(A.right, B.right);

    }

    public static void main(String[] args) {


    }


}
