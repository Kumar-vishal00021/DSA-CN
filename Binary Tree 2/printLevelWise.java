/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.*;
public class printLevelWise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while (!q.isEmpty()) {
            int levelSize = q.size();  // Number of nodes in the current level

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> node = q.remove();

                // Print the node's data
                System.out.print(node.data + " ");

                // Add the left and right children to the queue
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            // Move to the next line after printing the current level
            System.out.println();
        }
	}
	
}