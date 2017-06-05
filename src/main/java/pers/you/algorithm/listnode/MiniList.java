package pers.you.algorithm.listnode;

import java.util.Comparator;
import java.util.Stack;

public class MiniList<T>{
    private ListNode3<T> head = new ListNode3(null,null);
    public Comparator<T > comp;
    public int compare(T a,T b){
        if(comp!=null){
            return comp.compare(a,b);
        }else{
            Comparable<T> c = (Comparable<T>) a;
            return c.compareTo(b); 
        }
        
    }
    public T getMax(){
        if(head.next==null){
            return null;
        }
        ListNode3<T> p = head.next;
        T max = p.val;
        p = p.next;
        while(p!=null){
            if(compare(p.val, max)>0){
                max=p.val;
            }
            p=p.next;
        }
        return max;
    }
    
    
    public void arrayToList(T[] array){
        ListNode3<T> p = head;
        for(T t:array){
            ListNode3<T> node = new ListNode3<T>(t,null);
            p.next=node;
            p=node;
        }
    }
    
    public void printList(){
        ListNode3<T> p = head.next;
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
       
    }
    public void insert(int index,T value){
        ListNode3<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        ListNode3<T> node = new ListNode3<T>(value,null);
        node.next=p.next;
        p.next=node;
    }
    
    public T remove(int index){
        ListNode3<T> pre = head;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        ListNode3<T> p = pre.next;
        pre.next=p.next;
        return p.val; 
    }
    
    public T get(int index){
        ListNode3<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        return p.val;
    }
    
    public void set(int index,T value){
        ListNode3<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        p.val=value;
    }
    
    public void printInverse(){
        if(head.next==null){
            return;
        }
        Stack<T> stack = new Stack<T>();
        ListNode3<T> p = head.next;
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    } 
    
    public void printInverseRecursive(){
        if(head.next==null){
            return;
        }
        recursive(head.next);
        System.out.println();
    }
    
    
    private  void recursive(ListNode3<T> p){
        if(p!=null){
            recursive(p.next);
            System.out.print(p.val+" ");
        }
    }
}
