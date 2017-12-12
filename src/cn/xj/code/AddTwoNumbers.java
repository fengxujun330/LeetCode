package cn.xj.code;

/**
 * 
 * 
 * Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
 * 465 = 807.
 * 
 * @author alanfeng
 *
 */
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(null == l1)return l2;
        if(null == l2)return l1;
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = null;
        ListNode last = null;
        int jin = 0;
        while(p1 != null && p2 != null){
            int data = (p1.val + p2.val + jin)%10;
            jin = (p1.val + p2.val + jin)/10;
            ListNode tmp = last;
            last = new ListNode(data);
            if(null == result){
                result = last;
            }else{
                tmp.next = last;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 == null){
            while(p2 !=null){
                int data = (p2.val + jin)%10;
                jin = (p2.val + jin)/10;
                p2.val = data;
                last.next = p2;
                p2 = p2.next;
                last = last.next;
            }
        }
        if(p2 == null){
            while(p1 !=null){
                int data = (p1.val + jin)%10;
                jin = (p1.val + jin)/10;
                p1.val = data;
                last.next = p1;
                p1 = p1.next;
                last = last.next;
            }
        }
        if(p1 == null && p2 == null && jin != 0){
            ListNode tmp = new ListNode(jin);
            last.next = tmp;
        }
        return  result;
    }
    
}
