package pers.you.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;

public class TestSpeed {
    final int Max = 1 << 23;

    @Test
    public void testJDKQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random ra = new Random();
        int value;
        for (int i = 0; i <= Max; i++) {
            value = ra.nextInt();
            if (value % 3 != 0) {
                queue.offer(value);
            } else if (!queue.isEmpty()) {
                queue.peek();
                queue.poll();
            }
            while (!queue.isEmpty()) {
                queue.poll();
            }
        }
    }
        @Test
        public void testMiniQueue() {
            MiniQueue<Integer> queue = new MiniQueue<Integer>();
            Random ra = new Random();
            int value;
            for (int i = 0; i <= Max; i++) {
                value = ra.nextInt();
                if (value % 3 != 0) {
                    queue.offer(value);
                } else if (!queue.isEmpty()) {
                    queue.peek();
                    queue.poll();
                }
                while (!queue.isEmpty()) {
                    queue.poll();
                }
            }
    }
}
