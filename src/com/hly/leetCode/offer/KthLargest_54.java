package com.hly.leetCode.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/24
 * @QQ :1136513099
 * @desc : TODO 面试题54. 二叉搜索树的第k大节点
 * 若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
 * 若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
 * 任意节点的左、右子树也分别为二叉查找树；
 * 没有键值相等的节点。
 * 思路：中序遍历的结果，如果是左子树在前，右子树在后，遍历结果就是由小到大、如果是右子树在前，左子树在后，遍历结果就是由大到小；
 */
public class KthLargest_54 {

    int index = 0, result = 0;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    //解法1：递归
    public int kthLargest(TreeNode root, int k) {

        mid(root, k);
        return result;
    }

    public void mid(TreeNode root, int k) {

        if (root != null) {
            mid(root.right, k);
            //细节，这里是++
            if (++index == k) {
                result = root.val;
            }
            mid(root.left, k);
        }
    }
}
