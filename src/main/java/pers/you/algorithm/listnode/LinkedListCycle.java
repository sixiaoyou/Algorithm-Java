package pers.you.algorithm.listnode;

import org.junit.Test;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } else {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
    
    @Test
    public void test(){
        int[] array = {1,2,3,4,5,6,7};
        ListNode head = ListNode.arrayToList(array);
        System.out.println(hasCycle(head));
        head=ListNode.arrayToCircle(array);
        System.out.println(hasCycle(head));
        head=ListNode.createCycle(array, 3);
        System.out.println(hasCycle(head));           
    }
}
