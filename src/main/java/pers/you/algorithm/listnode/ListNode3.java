package pers.you.algorithm.listnode;

import java.util.Comparator;

public class ListNode3<T>{
    public T val;
    public ListNode3 next;

    public ListNode3(T val) {
        super();
        this.val = val;
    }

    public ListNode3(T val, ListNode3 next) {
        super();
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + "]";
    }    
    
    public void printList(ListNode3 head) {
        ListNode3 p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static  ListNode3 arrayToList(int[] array) {
        ListNode3 head = new ListNode3(0);
        ListNode3 p = head;
        for (int value : array) {
            p.next = new ListNode3(value);
            p = p.next;
        }
        return head.next;
    }
    
    
 
}
