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
public class printLevelWiseBinaryTree {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while( !q.isEmpty()){
			BinaryTreeNode<Integer> node = q.remove();
			System.out.print(node.data+":");
			if(node.left !=null){
				System.out.print("L:"+node.left.data+",");
				q.add(node.left);
			}else{
				System.out.print("L:"+-1+",");
			}
			if(node.right !=null){
				System.out.print("R:"+node.right.data);
				q.add(node.right);
			}else{
				System.out.print("R:"+-1);
			}
			System.out.println();
		}
	}
	
}