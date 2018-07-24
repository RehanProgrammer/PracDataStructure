package dataStructures;

public class Stacks {

    private Node head;
    private static class Node{
        Node next;
         int data;
        public Node (int data){
            this.data = data;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public int pop (){

        if (head == null){
            throw new IllegalStateException("Empty list!");
        }
       int data = head.data;
        head = head.next;
        return data;
    }

    public int peek (){
        return head.data;
    }
}
