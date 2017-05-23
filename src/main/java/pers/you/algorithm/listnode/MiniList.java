package pers.you.algorithm.listnode;

import java.util.Comparator;
import java.util.Stack;

public class MiniList<T>{
    private ListNode02<T> head = new ListNode02<T>(null,null);
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
        ListNode02<T> p = head.next;
        T max = p.value;
        p = p.next;
        while(p!=null){
            if(compare(p.value, max)>0){
                max=p.value;
            }
            p=p.next;
        }
        return max;
    }
    
    
    public void arrayToList(T[] array){
        ListNode02<T> p = head;
        for(T t:array){
            ListNode02<T> node = new ListNode02<T>(t,null);
            p.next=node;
            p=node;
        }
    }
    
    public void printList(){
        ListNode02<T> p = head.next;
        while(p!=null){
            System.out.print(p.value+" ");
            p=p.next;
        }
        System.out.println();
       
    }
    public void insert(int index,T value){
        ListNode02<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        ListNode02<T> node = new ListNode02<T>(value,null);
        node.next=p.next;
        p.next=node;
    }
    
    public T remove(int index){
        ListNode02<T> pre = head;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        ListNode02<T> p = pre.next;
        pre.next=p.next;
        return p.value; 
    }
    
    public T get(int index){
        ListNode02<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        return p.value;
    }
    
    public void set(int index,T value){
        ListNode02<T> p = head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        p.value=value;
    }
    
    public void printInverse(){
        if(head.next==null){
            return;
        }
        Stack<T> stack = new Stack<T>();
        ListNode02<T> p = head.next;
        while(p!=null){
            stack.push(p.value);
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
    
    
    private  void recursive(ListNode02<T> p){
        if(p!=null){
            recursive(p.next);
            System.out.print(p.value+" ");
        }
    }
}
