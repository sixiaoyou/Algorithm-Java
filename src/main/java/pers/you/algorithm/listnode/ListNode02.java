package pers.you.algorithm.listnode;

public class ListNode02<T>{
public T value;
public ListNode02<T> next;
public ListNode02(T value, ListNode02<T> next) {
    super();
    this.value = value;
    this.next = next;
}
public ListNode02() {
    super();
}
public ListNode02<T> pre;    
}
