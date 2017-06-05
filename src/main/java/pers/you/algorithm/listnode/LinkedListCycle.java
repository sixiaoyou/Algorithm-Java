package pers.you.algorithm.listnode;

import org.junit.Test;

public class LinkedListCycle {
    public boolean hasCycle(ListNode2 head) {
        if (head == null) {
            return false;
        } else {
            ListNode2 slow = head;
            ListNode2 fast = head;
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
        ListNode2 head = ListNode2.arrayToList(array);
        System.out.println(hasCycle(head));
        head=ListNode2.arrayToCircle(array);
        System.out.println(hasCycle(head));
        head=ListNode2.createCycle(array, 3);
        System.out.println(hasCycle(head));           
    }
}
