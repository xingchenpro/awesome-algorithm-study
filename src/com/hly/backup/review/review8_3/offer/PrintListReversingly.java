package com.hly.backup.review.review8_3.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :6、从尾到头打印链表
 */
public class PrintListReversingly {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void print(ListNode head) {
      if(head.next!=null){
          print(head.next);
          System.out.println(head.next.val);
      }

    }


}
