package pers.you.algorithm.listnode;

import org.junit.Test;

public class Josephus {
   //n=8 start=3 step=4
    public ListNode2 getStart(ListNode2 head,int start){
        ListNode2 p = head;
        for(int i=1;i<start;i++){
            p=p.next;
        }
        return p;
    }
    public ListNode2 countAndRemove(ListNode2 node,int step){
        ListNode2 pre = node;
        for(int i=1;i<step-1;i++){
            pre = pre.next;
        }
        System.out.println(pre.next.val);
        pre.next = pre.next.next;
        return pre.next;
    }
    
    public void josephusCircle(ListNode2 head,int n,int start,int step){
        ListNode2 startNode = getStart(head, start);
        for(int i=1;i<=n;i++){
            startNode = countAndRemove(startNode, step);
        }
        startNode.next=null;
    }
 
@Test
public void test(){
    int[] array = {1,2,3,4,5,6,7,8};
    ListNode2 head = ListNode2.arrayToCircle(array);
    josephusCircle(head, array.length, 3, 4);
    }
}
