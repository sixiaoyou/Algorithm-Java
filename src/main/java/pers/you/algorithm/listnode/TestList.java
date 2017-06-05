package pers.you.algorithm.listnode;

import java.util.Comparator;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class TestList {
    @SuppressWarnings("unused")
    @Test
    public void testNode01(){
        ListNode3<Integer> p4 = new ListNode3<Integer>(4,null);
        ListNode3<Integer> p3 = new ListNode3<Integer>(3,p4);
        ListNode3<Integer> p2 = new ListNode3<Integer>(2,p3);
        ListNode3<Integer> p1 = new ListNode3<Integer>(1,p2);
    }
    
    
    @SuppressWarnings("unused")
    @Test
    public void testNode02(){
        ListNode3<Integer> p1 = new ListNode3<Integer>(1,new ListNode3<Integer>(2,
                new ListNode3<Integer>(3,new ListNode3<Integer>(4,null))));
    }
    
    @Test
    public void testMiniList(){
        MiniList<Integer> list = new MiniList<Integer>();
        Integer[] array = {1,2,3,4,5};
        list.arrayToList(array);
        list.printList();
        list.insert(2, 10);
        list.printList();
        list.remove(4);
        list.printList();
        System.out.println(list.get(3));
        list.set(3, 1);
        System.out.println(list.get(3));
    }
    
    @Test
    public void testPrintReverse(){
        MiniList<Integer> list = new MiniList<Integer>();
        Integer[] array = {1,2,3,4,5};
        list.arrayToList(array);
        list.printList();
        list.printInverse();
        list.printInverseRecursive();
    } 
    
    @Test
    public void testMaxInteger(){
        MiniList<Integer> list = new MiniList<Integer>();
        Integer[] array = {3,4,1,2};
        list.arrayToList(array);
        System.out.println(list.getMax());    
    }
    
    @Test
    public void testMaxPerson(){
        MiniList<Person> list = new MiniList<Person>();
        list.comp = new  Comparator<Person>() {
            @Override
            public int compare(Person o1,Person o2){
                return o1.getId() - o2.getId();
            }
        };            
        Person[] array = {new Person(3, "AAA"),new Person(2, "BBB"),new Person(1, "CCC"),new Person(4, "DDD")};
        list.arrayToList(array);
        System.out.println(list.getMax());
    }
}
