package pers.you.algorithm.listnode;

import java.util.HashSet;

import org.junit.Test;

public class IntersectionOfTwoLinkedLists {

    @Test
    public void test01() {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 9, 10 };
        ListNode2[] heads = ListNode2.arrayToIntersection(array1, array2, 5);
        ListNode2.printList(heads[0]);
        ListNode2.printList(heads[1]);

    }

    public ListNode2 bruteForce(ListNode2 headA, ListNode2 headB) {
        for (ListNode2 p = headA; p != null; p = p.next) {
            for (ListNode2 q = headB; q != null; q = q.next) {
                if (p == q) {
                    return p;
                }
            }
        }
        return null;
    }

    public ListNode2 hashFunction(ListNode2 headA, ListNode2 headB) {
        HashSet<ListNode2> hashSet = new HashSet<ListNode2>();
        for (ListNode2 p = headB; p != null; p = p.next) {
            hashSet.add(p);
        }
        for (ListNode2 p = headA; p != null; p = p.next) {
            if (hashSet.contains(p)) {
                return p;
            }
        }
        return null;
    }

    @Test
    public void test02() {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 9, 10 };
        ListNode2[] heads = ListNode2.arrayToIntersection(array1, array2, 5);
        ListNode2 head = hashFunction(heads[0], heads[1]);
        System.out.println(head.val);
        head = hashFunction(ListNode2.arrayToList(array1), ListNode2.arrayToList(array2));
        System.out.println(head);
    }

    public int lengthOfList(ListNode2 head) {
        ListNode2 p = head;
        int n = 0;
        while (p != null) {
            n++;
            p = p.next;
        }
        return n;
    }

    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        int m = lengthOfList(headA);
        int n = lengthOfList(headB);
        if (m == 0 || n == 0) {
            return null;
        } else {
            int k;
            ListNode2 p = headA;
            ListNode2 q = headB;
            if (m > n) {
                k = m - n;
                for (int i = 1; i <= k; i++) {
                    p = p.next;
                }
            } else if (n > m) {
                k = m - n;
                for (int i = 1; i <= k; i++) {
                    q = q.next;
                }
            }
            while (p != null && q != null) {
                if (p == q) {
                    return q;
                } else {
                    p = p.next;
                    q = q.next;
                }
            }
            return null;
        }
    }

    @Test
    public void test03() {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 9, 10 };
        ListNode2[] heads = ListNode2.arrayToIntersection(array1, array2, 5);
        ListNode2 head =getIntersectionNode(heads[0], heads[1]);
        System.out.println(head.val);
        head = getIntersectionNode(ListNode2.arrayToList(array1), ListNode2.arrayToList(array2));
        System.out.println(head);
    }

}
