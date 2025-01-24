// import java.util.*;
// void levelOrder(Node root){
//     Queue<Node> q = new LinkedList<>();
//     q.add(root);

//     while(!isEmpty){
//         Node temp = q.remove();
//         System.out.print(temp.data);
//         if(temp.left!=null)
//         q.add(temp.left);
//         if(temp.right!=null)
//         q.add(temp.right);
//     }
// }

// public class tree {
//     public static void main(String[] args) {
       
//     }
// }
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree {
    
    // Method to perform level order traversal
    void levelOrder(Node root) {
        if (root == null) return; // edge case: if the tree is empty

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll(); // removes the front of the queue
            System.out.print(temp.data + " "); // prints the data

            // Add left child to queue if it exists
            if (temp.left != null) 
                q.add(temp.left);

            // Add right child to queue if it exists
            if (temp.right != null) 
                q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        // Sample binary tree
        tree Tree = new tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        // Call levelOrder method
        System.out.println("Level order traversal:");
        Tree.levelOrder(root);
    }
}
