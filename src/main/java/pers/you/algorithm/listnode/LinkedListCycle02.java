package pers.you.algorithm.listnode;

import org.junit.Test;

public class LinkedListCycle02 {
    public ListNode2 detectCycle(ListNode2 head) {
        if (head == null) {
            return null;
        } else {
            ListNode2 slow = head;
            ListNode2 fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break;
                }
            }
            if (fast == null || fast.next == null) {
                return null;
            } else {
                slow = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
    }
    
    @Test
    public void test(){
        int[] array = {1,2,3,4,5,6,7};
        ListNode2 head = ListNode2.arrayToList(array);
        System.out.println(detectCycle(head));
        head=ListNode2.arrayToCircle(array);
        System.out.println(detectCycle(head).val);
        head=ListNode2.createCycle(array, 3);
        System.out.println(detectCycle(head).val);           
    }

}
