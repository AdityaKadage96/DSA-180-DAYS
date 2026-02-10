package Queue;


class Queue {
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = value;
        System.out.println(value + " inserted into queue");
    }

    
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = arr[front];
        front++;
        return removed;
    }

    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class QueueDSbyUsingArray{
    public static void main(String[] args) {
        //1. Creating Queue Objec
        Queue q = new Queue(5);
        
        //2.Enter data in Queue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        //3. Display Queue element 

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();
        //4.Display peek element 

        System.out.println("Front element: " + q.peek());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        q.display();
    }
}
