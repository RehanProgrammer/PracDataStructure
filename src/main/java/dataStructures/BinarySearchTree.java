package dataStructures;

public class BinarySearchTree {
    public class Node{
         int key;
         String value;
         Node right;
         Node left;

        public Node (int key, String value){
            this.key = key;
            this.value = value;

        }

        public Node minNode (){
            if (left == null){
                return this.left;
            }
            else {
                return left.minNode();
            }

        }
    }
    Node root;
    public String find (int key){

        Node node = find (root , key);

        return node == null ? null : node.value;
    }

    private Node find (Node node, int key){
        if (node == null || node.key == key){
            return node;
        }
        else if (node.key < key){
            node = node.left;
            find (node,key);
        }
        else if (node.key > key){
            node = node.right;
            find (node,key);
        }
        return null;
        }

        public void insert (int key, String value){
         root = insertItem(root , key ,value);
        }

        public Node insertItem (Node node , int key, String value){
             Node newNode = new Node(key, value);
                if (node == null){
                    node = newNode;
                    return node;
                }

                if (key < node.key){
                   node.left = insertItem(node , key, value);
                   }
                   else if (key > node.key){
                    node.right = insertItem(node , key, value);
                }
                return node;
        }



}
