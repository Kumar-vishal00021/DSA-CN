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
// asked in Paytm,Acko
public class diameterOfBinaryTree {
	public static int height(BinaryTreeNode<Integer> root){
		if(root == null) return 0;
		return Math.max(height(root.left) , height(root.right)) +1;
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null) return 0;
		int h = height(root.left) + height(root.right) +1;
		int p1 = diameterOfBinaryTree(root.left);
		int p2 = diameterOfBinaryTree(root.right);
		int d = Math.max(p1,Math.max(p2,h));
		return d;
	}
	
}