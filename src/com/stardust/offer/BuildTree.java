package com.stardust.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/4/20
 * @desc : TODO 07. 重建二叉树
 */
public class BuildTree {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preOrder, int[] inOrder, int preOrderLeft, int preOrderRight, int inOrderLeft, int inOrderRight) {

        if (preOrderLeft > preOrderRight) {
            return null;
        }
        //前序遍历中第一个节点就是根节点
        int preOrderRoot = preOrderLeft;
        //在中序遍历中定位根节点
        int inOrderRoot = indexMap.get(preOrder[preOrderRoot]);
        //建立根节点
        TreeNode root = new TreeNode((preOrder[preOrderRoot]));
        //左子树中节点的数目
        int leftSubtreeSize = inOrderRoot - inOrderLeft;
        //递归地构建左子树，并连接到根节点
        //先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preOrder, inOrder, preOrderLeft + 1, preOrderLeft + leftSubtreeSize, inOrderLeft, inOrderRoot - 1);
// 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preOrder, inOrder, preOrderLeft + leftSubtreeSize + 1, preOrderRight, inOrderRoot + 1, inOrderRight);
        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

}
