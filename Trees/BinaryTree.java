// Implementation of tree -> there are 2 ways to implement a tree
// 1. Linked respresentation( using linked list )
// 2. sequential representation ( using array ) -> this one is used in heaps

import java.util.Scanner;

public class BinaryTree {
    // Binary tree is a tree in which each node has at most 2 children
    private Node root; // root is the top node of the tree

    public BinaryTree() {
        root = null; // Initialize the root to null
    }

    // Method to populate the binary tree
    public void populate(Scanner sc) {
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

    // In-order display of the tree
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

    // Node class
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}