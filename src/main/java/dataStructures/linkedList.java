package dataStructures;

public class linkedList {
    private Node head;
    private static class Node {
        Node next;
        int data;

        public Node (int data){
            this.data = data;
        }
    }

    public void addFront(int data){

        //create a new node
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        }

        public int getFirst(){
        if (head==null){
            throw new IllegalStateException("Empty list!");
        }
        return head.data;
        }

        public int getLast(){
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
         }
         return temp.data;
        }

        public void addBack(int data){
        Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }

        public int size(){
            int size = 0;
        if (head == null){
            return size;
           }
           Node current =head;
          if(current!=null){
            size++;
          }
          while (current.next!=null){
              current = current.next;
              size++;
          }
           return size;
        }

        public void clear(){
        head = null;
        }

        public void deleteValue(int data){
        Node current = head;

        if (head == null) {
            throw new IllegalStateException("Trying to delete an empty list!");

        }
        else if (head.data == data) {
            head = head.next;
            return;
        }
          while (current.next!=null){

              if (current.next.data == data){
                  current.next = current.next.next;
                  break;
              }
                current = current.next;
          }


        }

}
