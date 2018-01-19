package cn.xj.code;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, Given 1->1->2, return 1->2. 
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author alanfeng
 *
 */
public class RemoveDuplicatesfromSortedList {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while(null != tmp){
            ListNode current = tmp;
            ListNode next = current.next;
            if(null == next){
                break;
            }
            if(current.val == next.val){
                current.next = next.next;
                continue;
            }
            tmp = next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        print(deleteDuplicates(createList(new int[]{1,1,2})));
        print(deleteDuplicates(createList(new int[]{1,1,1,2,2,3,3})));
    }
    
    private static ListNode createList(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode last = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode tmp = new ListNode(nums[i]);
            last.next = tmp;
            last = tmp;
        }
        return head;
    }
    
    private static void print(ListNode head){
        while(null != head){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
