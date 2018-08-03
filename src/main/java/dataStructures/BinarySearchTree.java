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
                return this;
            }
            else {
                return left.minNode();
            }

        }
    }
    Node root;

    public BinarySearchTree () {
        root = null;
    }
    public String find (int key){

        Node node = find (root , key);

        return node == null ? null : node.value;
    }

    private Node find (Node node, int key){
        if (node == null || node.key == key){
            return node;
        }
        else if (node.key < key){
            node = node.right;
            return find (node,key);
        }
        else if (node.key > key){
            node = node.left;
            return find (node,key);
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
                    System.out.println(node.key);
                    return node;
                }

               else if (key < node.key){

                   node.left = insertItem(node.left , key, value);

                   }
                 else if (key > node.key){
                    node.right = insertItem(node.right , key, value);
                }
                return node;
        }

        public void delete (int key){
        deleteItem(root, key);
        }

        public Node deleteItem (Node node, int key){
            if (node == null){
                return null;
            }
            else if (key < node.key){
                node.left = deleteItem(node , key);
            }
            else if (key > node.key){
                node.right = deleteItem(node , key);
            }
            else{
                if (node.left == null && node.right == null){
                    node = null;
                }
                else if (node.right==null){
                    node = node.left;
                }
                else if (node.left == null){
                    node = node.right;
                }
                else{
                    Node minNode = findMin_OnRight(node.right);
                    node.key = minNode.key;
                    node.value = minNode.value;
                    node.right = deleteItem(node , key);
                }
            }
          return node;
        }

        public Node findMin_OnRight (Node node){
            return node.minNode();
        }



}
