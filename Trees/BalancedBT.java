// Why Are Balanced Trees Needed?
// A Binary Tree (BT) becomes skewed when all the nodes lean to one side:
// Left-skewed: Every node only has a left child.
// Right-skewed: Every node only has a right child.
// becaues of this skewed nature, the tree becomes unbalanced and resembles a linked list and takes the time complexity to O(N) rather than taking it to O(log(N)). 
// This can lead to inefficient operations, as the time complexity for searching, inserting, or deleting nodes in a skewed tree can degrade to O(n) in the worst case. 
// In contrast, a balanced binary tree maintains a more optimal structure, ensuring that operations can be performed in O(log n) time on average.
// Example of a Skewed BT:
// Right-Skewed Tree (basically a list):
//   1
//    \
//     2
//      \
//       3
//        \
//         4
// Search for 5? → 1 ➝ 2 ➝ 3 ➝ 4 ➝ 5 → Took 5 steps. That's O(n).


// What is a Balanced Tree?
// A Balanced Binary Tree is a tree where the height difference between the left and right subtrees of any node is either 0,1 or -1.
// This keeps operations like insert, delete, search efficient — all in O(log n) time.

// Types of Balanced Trees:
// AVL Tree (Strictly balanced)
// Red-Black Tree (Loosely balanced, but faster inserts)
// Splay Tree (Self-adjusting)
// B-Trees (Used in databases and filesystems)
// Weight Balanced Trees, Treaps, etc.

// Unbalanced (Right-skewed BT)
//   10
//     \
//      20
//        \
//         30

// AVL Rotation Applied: Left Rotation at 10
//       20
//      /  \
//    10    30
// Now it's balanced — left and right heights are equal for each node.
// Balanced Trees maintain height ≈ log n, giving O(log n) time.
// AVL Tree: A strictly balanced BT using rotations (Left, Right, LR, RL).

public class BalancedBT {
    
}
