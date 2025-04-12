// let suppose this is a normal tree
//      1
//     / \
//    2   3
//   / \   \
//  4   5   6

// There are 3 types of traversal in a binary tree: Pre-order, In-order, and Post-order traversal.
// Pre-order traversal visits the root node first, then the left subtree, and finally the right subtree. Used in evaluating maths expressions or making a copy and serializaton of array/strings.
// Definition: Visit Node → Left subtree → Right subtree.
// Traversal Order: 1 2 4 5 3 6
//               1 (1st)
//              /     \
//           2 (2nd)  3 (5th)
//           /   \         \
//       4 (3rd) 5 (4th)   6 (6th)


// In-order traversal visits the left subtree first, then the root node, and finally the right subtree. Used when we want to visit nodes in sorted manner in BST.
// Definition: Visit left subtree → Node → Right subtree.
// Traversal Order: 4 2 5 1 3 6
//              1 (4th)
//             /     \
//          2 (2nd)  3 (5th)
//          /   \         \
//      4 (1st) 5 (3rd)   6 (6th)

// Post-order traversal visits the left subtree first, then the right subtree, and finally the root node. Used when we want to delete a tree( because we cant delete a node until it have children so firstly we delete left and right child then node ) or when we do bottom up calculations.
// Postorder Traversal
// Definition: Visit left subtree → Right subtree → Node.
// Traversal Order: 4 5 2 6 3 1
//               1 (6th)
//              /     \
//           2 (3rd)  3 (5th)
//           /   \         \
//       4 (1st) 5 (2nd)   6 (4th)


import java.util.Scanner;

public class TraversalOnBT {

    Node root;

    TraversalOnBT() {
        root = null;
    }

    private void populate(Scanner sc) {
        System.out.print("Enter the value of the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node) {
        System.out.print("Do you want to add a left child to " + node.value + "? (true/false): ");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.print("Enter the value of the left child of " + node.value + ": ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.print("Do you want to add a right child to " + node.value + "? (true/false): ");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.print("Enter the value of the right child of " + node.value + ": ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        System.out.println("Tree (in-order traversal): ");
        System.out.println();
        display(root, 0);
        System.out.println();
    }
    private void display(Node node, int level) {
        if (node == null) return;

        display(node.right, level + 1);

        // Indent according to the level of the node
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-----> " + node.value);
        } else {
            System.out.println(node.value);
        }

        display(node.left, level + 1);
    }

    // Pre-order traversal
    public void preOrderTraversal() {
        System.out.println("Pre-order Traversal: ");
        preOrderTraversal(root);
        System.out.println();
    }
    private void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


    // In-order traversal
    public void inOrderTraversal() {
        System.out.println("In-order Traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }  
    private void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }


    // Post-order traversal
    public void postOrderTraversal() {
        System.out.println("Post-order Traversal: ");
        postOrderTraversal(root);
        System.out.println();
    }
    private void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }


    class Node {
        int value;
        Node left, right;
        int height;
        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TraversalOnBT tree = new TraversalOnBT();
        tree.populate(sc);
        tree.display();
        tree.preOrderTraversal();
        tree.inOrderTraversal();
        tree.postOrderTraversal();
    }    
}