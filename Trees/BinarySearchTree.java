// A BST( Binary Search Tree ) is just a binary tree in which left hand elements are smaller than the its parents and right hand elements are greater than the its parents.

public class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        root = null;
    }

    private int height(Node node) {
        if(node ==  null) {
            return -1;
        }
        return node.height;
    }
    private boolean isEmpty() {
        return root == null;
    }


    private void display(){
        display(root, "Root Node : ");
    }
    private void display(Node node, String details){
        if(node == null) {
            return;
        }
        System.out.println(details + node.getValue() + " (Height: " + node.height + ")");
        display(node.left, "Left Child of " + node.getValue() + ": ");
        display(node.right, "Right Child of " + node.getValue() + ": ");
    }
    
    private Node insert(int value) {
        return insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    
    private boolean isbalance() {
        return isbalance(root);
    }
    private boolean isbalance(Node node) {
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isbalance(node.left) && isbalance(node.right);
    }


    static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue( ) {
            return value;
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(10);
        bst.root = bst.insert(5);
        bst.root = bst.insert(15);
        bst.root = bst.insert(3);
        bst.root = bst.insert(7);
        bst.root = bst.insert(12);
        bst.root = bst.insert(18);

        System.out.println("Is the tree balanced: " + (bst.isbalance() ? "Yes" : "No"));
        System.out.println("Tree height: " + (bst.height(bst.root) + 1));
        System.out.println("Tree is empty? " + (bst.isEmpty() ? "Yes" : "No"));
        System.out.println("Display the tree:-- ");
        bst.display();    
    }
}
