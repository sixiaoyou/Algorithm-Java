package pers.you.algorithm.listnode;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class NthNodeFromEndOfList {
    public int lengthOfList(ListNode head){
        int m = 0;
        ListNode p = head;
        while(p!=null){
            m++;
            p=p.next;
        }
        return m;
    }

    public ListNode find01(ListNode head,int n){
        if(head==null){
            return head;
        }else{
            int m = lengthOfList(head);
            ListNode p =head;
            for(int i=1;i<=m-n;i++){
                p=p.next;
            }
            return p;
        }
    }
    
    public ListNode find02(ListNode head,int n){
        if(head==null){
            return head;
        }else{
            ListNode p1 = head;
            ListNode p2 = head;
            for(int i=1;i<=n;i++){
                p2=p2.next;
            }
            while(p2!=null){
                p1=p1.next;
                p2=p2.next;
            }
            return p1;
        }
    }
    
    
    @Test
    public void test(){
        int[] array ={1,2,3,4,5,6};
        ListNode head = ListNode.arrayToList(array);
        System.out.println(find01(head,4).val);      
    }
    
    @Test
    public void test01(){
        int[] array ={1,2,3,4,5,6};
        ListNode head = ListNode.arrayToList(array);
        System.out.println(find02(head,4).val);
    }
}
