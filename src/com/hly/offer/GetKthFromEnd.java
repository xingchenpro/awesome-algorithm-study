package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : 面试题22. 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class GetKthFromEnd {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //解法1：双指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        //former 先向前走 k 步，former 和 latter相距 k 步
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        //双指针每轮向前走一步，former走到链表尾部时跳出
        while (former!=null){
            former = former.next;
            //跳出时，latter距离尾部 k-1
            latter = latter.next;
        }
        //直接返回 latter
        return latter;
    }

    //解法2：先遍历链表的长度
    public static void main(String[] args) {
        System.out.println("");
    }


}
