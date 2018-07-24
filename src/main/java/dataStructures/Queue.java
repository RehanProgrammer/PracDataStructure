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
            head=NewNode;
            tail = NewNode;
            return;
        }
        tail = NewNode;
        NewNode.next = head;
        head = NewNode;
    }

    public int deque(){
        return tail.data;
    }
}
