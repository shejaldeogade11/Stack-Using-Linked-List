import java.util.ArrayList;

public class StackLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
       static Node head=null; //we create node in linked list that is Head node

       public static boolean isEmpty(){  //for LLis empty
         return head ==null;
       }

       //posh
       public static void push(int data){
        Node newNode =new Node(data); //create newnode

        if(isEmpty()){
        head = newNode;
        return;
       }
    

       newNode.next = head;
       head = newNode;
    }
     
    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top =head.data;
        head = head.next;
        return top;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
 }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())  {  //jab tak loop chale ka tab tak our loop not empty
           System.out.println(s.peek());
            s.pop();
            }
    }
}