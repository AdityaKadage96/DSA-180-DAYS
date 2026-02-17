package Queue;

import java.util.*;

class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    
    void enqueue(int x) {
        s1.push(x);
        System.out.println(x + " inserted");
    }

    
    void dequeue() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Removed: " + s2.pop());
    }

    
    void peek() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Front element: " + s2.peek());
    }

    
    void display() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.print("Queue: ");
        for (int i = s2.size() - 1; i >= 0; i--) {
            System.out.print(s2.get(i) + " ");
        }
        System.out.println();
    }
}

public class queueDay91 {
    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.peek();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.display();
    }
}
