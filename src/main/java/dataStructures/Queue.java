package dataStructures;

public class Queue {

    private Node head;
    private Node tail;
    private static class Node{
        Node next;
        int data;
        public Node (int data){
            this.data = data;
        }
    }

    public void enque(int data){
        Node NewNode = new Node(data);
        if (head == null){
            tail = NewNode;
            head=tail;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
    }

    public int deque(){
        int data = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return data;
    }
}
