package pers.you.algorithm.listnode;

import org.junit.Test;

public class Josephus {
   //n=8 start=3 step=4
    public ListNode getStart(ListNode head,int start){
        ListNode p = head;
        for(int i=1;i<start;i++){
            p=p.next;
        }
        return p;
    }
    public ListNode countAndRemove(ListNode node,int step){
        ListNode pre = node;
        for(int i=1;i<step-1;i++){
            pre = pre.next;
        }
        System.out.println(pre.next.val);
        pre.next = pre.next.next;
        return pre.next;
    }
    
    public void josephusCircle(ListNode head,int n,int start,int step){
        ListNode startNode = getStart(head, start);
        for(int i=1;i<=n;i++){
            startNode = countAndRemove(startNode, step);
        }
        startNode.next=null;
    }
 
@Test
public void test(){
    int[] array = {1,2,3,4,5,6,7,8};
    ListNode head = ListNode.arrayToCircle(array);
    josephusCircle(head, array.length, 3, 4);
    }
}
