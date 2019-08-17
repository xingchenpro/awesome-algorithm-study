package com.hly.offer.chapter3;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/31
 * @QQ :1136513099
 * @desc :25、合并两个有序链表
 */
public class MergeList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //迭代
    public ListNode mergeList(ListNode l1,ListNode l2){

      ListNode head = new ListNode(0);
      ListNode cur = head;
      while (l1!=null&&l2!=null){
          if(l1.val<l2.val){
              cur.next = l1;
              l1 = l1.next;
          }else{
              cur.next = l2;
              l2 = l2.next;
          }
          cur = cur.next;
      }
      while (l1!=null)
          cur.next = l1;
      while (l2!=null)
          cur.next = l2;
      return head.next;
    }
}
