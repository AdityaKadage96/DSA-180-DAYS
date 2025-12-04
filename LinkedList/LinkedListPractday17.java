package LinkedList;

class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val){
        Node newNode=new Node(val);
        if(head==null) head=tail=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    void insertAtTail(int val){
        Node newNode=new Node(val);
        if(head==null) head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }

        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        head=head.next;
        if(head==null) tail=null;

        size--;
    }

    void deleteAtTail(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
        }else{
            Node curr=head;

            while(curr.next!=tail){
                curr=curr.next;
            }
            curr.next=null;
            tail=curr;
        }
        size--;
    }

    int searchEle(int val){
        if(head==null) return -1;
        Node curr=head;
        int idx=0;
        while(curr!=null){
            if(curr.val==val) return idx;
            curr=curr.next;
            idx++;
        }
        return -1;

    }
    
    boolean search(int val){
        if(head==null) return false;
        Node curr=head;
        while(curr!=null){
            if(curr.val==val) return true;
            curr=curr.next;
        }

        return false;
    }
    void display(){
        if(head==null) return;
        Node newNode=head;

        while(newNode!=null){
            System.out.print(newNode.val+" ");
            newNode=newNode.next;
        }
        System.out.println();
    }

}
public class LinkedListPractday17 {
    public static void main(String[]args){
     LinkedList ll=new LinkedList();
     //1.insertion at head of the linkedlist
     ll.insertAtHead(10);
     ll.insertAtHead(20);
     ll.insertAtHead(30);
     ll.insertAtHead(40);

     //2.insertion at tail of the linkedlist
     ll.insertAtTail(60);
     ll.insertAtTail(70);
     
     //3.Display LinkedList
     ll.display();

     //4.Search element in linkedlist (boolean function)
      ll.search(60);
    
    //5.Search element in linkedlist - int function , return value integer
      ll.searchEle(20);
      ll.searchEle(100);

      System.out.println(ll.searchEle(20));
      System.out.println(ll.searchEle(60));

    //6.Delete at head
      ll.deleteAtHead();
      ll.deleteAtTail();

      System.out.println(ll.search(60));// Ouptut:true

    }
}
