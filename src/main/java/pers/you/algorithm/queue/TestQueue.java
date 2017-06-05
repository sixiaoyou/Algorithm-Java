package pers.you.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;

public class TestQueue {

    @Test
    public void testJDKQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println(queue.size());
        int[] array = { 1, 2, 3, 4, 5 };
        for (int k : array) {
            queue.offer(k);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.peek() + " " + queue.poll());
        }
    }
    
    final int Max = 1<<20;
    @Test
    public void testFunction(){
        Queue<Integer> queue1 = new LinkedList<Integer>();
        MiniQueue<Integer> queue2 = new MiniQueue<Integer>();
        Random ra = new Random();
        int value;
        for(int i=0;i<=Max;i++){
            value= ra.nextInt();
            if(value%3!=0){
                queue1.offer(value);
                queue2.offer(value);
            }else if(!queue1.isEmpty() && !queue2.isEmpty()){
                Assert.assertTrue(queue1.peek().equals(queue2.peek()));
                Assert.assertTrue(queue1.size()==queue2.peek());
                
            }
            while(!queue1.isEmpty()){
                Assert.assertTrue(queue1.poll().equals(queue2.poll()));
            }
        }
    }
}
