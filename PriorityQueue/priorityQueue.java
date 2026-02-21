package PriorityQueue;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(5);

        System.out.println(pq);
    }
}