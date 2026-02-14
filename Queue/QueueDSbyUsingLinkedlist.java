package Queue;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue1{
    Node front,rear;

    void enqueue(int val){
        Node newNode=new Node(val);

        if(rear==null){
            front=rear=newNode;
            return ;
        }

        rear.next=newNode;
        rear=newNode;
    }

    int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }

        int val=front.data;
        front=front.next;

        if(front==null){
            rear=null;
        }

        return val;
    }

    int peek(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty(){
        return front==null;
    }

    void display(){
        Node temp=front;

        while(temp !=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }

        System.out.println();
    }


   
}

 public class QueueDSbyUsingLinkedlist{
        public static void main(String []args){
            //Creat Queue by using Linked list
            Queue1 q=new Queue1();
            
            //1.Enter element in queue
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            
            //2.Display queue element
            q.display();
            
            //3.Dequeue queue element

            q.dequeue();

            //4.Peek of the queue element
            
            q.peek();
            System.out.println(q.peek());

            q.isEmpty();


        }
    }