package com.hly.algorithms2018.list;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/21
 * @QQ :1136513099
 * @desc :206.反转链表
 */
public class ReverseList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //todo 递归
    public static ListNode reverseList1(ListNode head) {
        if(head==null||head.next==null)
            return head;
        //把当前节点的下一个节点赋值给p，最后一层时p为尾结点
        ListNode p = reverseList1(head.next);
        //把当前节点赋值给当前节点的下一个的下一个节点，表示反转
        head.next.next = head;
        head.next = null;
        //给上一层回调p
        return  p;
    }

    //迭代
    public static ListNode reverseList2(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr!=null){
           ListNode nextTemp = curr.next;
           curr.next = prev;
           prev = curr;
           curr =nextTemp;
       }
       return prev;
    }


    public static void main(String[] args){

        ListNode head = new ListNode(0);
        ListNode p = head;
        for(int i=1;i<=5;i++){
            p.next = new ListNode(i);
            p = p.next;
        }

        ListNode h = reverseList1(head);
        while (h!=null){
            System.out.print(h.val+" ");
            h = h.next;
        }

        /*while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }*/



    }


}
