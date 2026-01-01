package Stack;

class Stack{
    int top;
    int size;
    int arr[];

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;

    }

    void push(int x){
        if(top == size-1){
            System.out.println("Stack overflow");
            return ;
        }
        arr[++top]=x;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }

        top--;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty(){
        return top== -1;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack empty");
            return;
        }

        for(int i=top;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
        
        System.out.println();
    }
}



public class stackArray {

    public static String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();

        for(char c: s.toCharArray()){
            int len=sb.length();

            if(len >0 && sb.charAt(len-1)==c){
                sb.deleteCharAt(len-1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[]args){
      //1.Stack implementation by using array

      Stack s=new Stack(5);
      s.push(10);
      s.push(20);
      s.push(30);

      s.display();
      System.out.println(s.peek());
      s.pop();
      System.out.println(s.peek());


      //2.
      String s1="abbaca";
      removeDuplicates(s1);
      System.out.println(removeDuplicates(s1));
    }
}
