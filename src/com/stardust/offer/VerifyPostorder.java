package com.stardust.offer;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/21
 * @desc : 33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * 后序遍历：左、右、根
 * 二叉搜索树：左子树节点的值小于根节点的值，右子树节点的值大于根节点的值
 * 后序遍历：最后一个节点是根节点
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/xu-yao-zhi-dao-er-cha-sou-suo-shu-de-xin-37mk/
 */
public class VerifyPostorder {

    public boolean verifyPostorder(int[] postorder) {
        return invoke(postorder, 0, postorder.length - 1);
    }


    //1,3,2,6,5
    private boolean invoke(int[] arr, int i, int j) {

        //右子树都遍历完，都大于根节点，到头了，退出来
        if (i >= j) {
            return true;
        }

        //从左边开始，找到第一个比根节点大的数，也是就右子树中的一个节点
        //6 就是右子树的一个节点
        int mid = i;
        while (arr[mid] < arr[j]) {
            mid++;
        }
        //mid 还需要使用，先赋值给 temp 进行下一步判断
        int temp = mid;
        //右边的节点不能小于根，如果从 6 开始的节点开始找，有比 5 小的节点，说明一定不是二叉搜索树
        while (temp < j) {
            if (arr[temp] < arr[j]) {
                return false;
            }
            temp++;
        }
        //左子树和右子树都满足二叉搜索树的性质
        //递归查找 6 左边的数和右边的数
        return invoke(arr, i, mid - 1) && invoke(arr, mid, j - 1);
    }


    public static void main(String[] args) {
        System.out.println("");
    }
}
