package Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack1{
    Node top;
    Stack1(){
        top=null;
    }

    void push(int x){
        Node newNode=new Node(x);
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return -1;
        }

        int removeEle=top.data;
        top=top.next;

        return removeEle;
    }

    int peek(){
        if(top==null){
            System.out.println("Stack empty");
            return -1;
        }

        return top.data;
    }

    boolean isEmpty(){
        return top==null;
    }
    
    void display(){
        Node temp=top;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

        System.out.println();

    }
}
public class stackImpArray {
    public static void main(String[]args){
       Stack1 st=new Stack1();

       //1.Insert elemet into stack
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(49);
       
       //2.Display stack element
       st.display();

       //3.pop Element from stack
       System.out.println(st.pop());

       //4. Top Elmenet of Stack
       System.out.println(st.peek());

       st.display();
    }
}
