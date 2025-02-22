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

// asked in TCS,Celebal Tech,Maersk,Wolters kluwe
public class isNodePresents {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null) return false;
		if(root.data == x) return true;
		boolean result = isNodePresent(root.left,x);
		if(result) return result;
		else {
			result =isNodePresent(root.right,x);
		}
		return result;
	}

}