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
// public class diameterOfBinaryTree {
// 	public static int height(BinaryTreeNode<Integer> root){
// 		if(root == null) return 0;
// 		return Math.max(height(root.left) , height(root.right)) +1;
// 	}
// 	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
// 		//Your code goes here
// 		if(root == null) return 0;
// 		int h = height(root.left) + height(root.right) +1;
// 		int p1 = diameterOfBinaryTree(root.left);
// 		int p2 = diameterOfBinaryTree(root.right);
// 		int d = Math.max(p1,Math.max(p2,h));
// 		return d;
// 	}
	
// }



// approach 2 optimized
class hd{
	int height;
	int diameter;
	hd(int h,int d){
		this.height = h;
		this.diameter = d;
	}
}
public class diameterOfBinaryTree {
	public static hd heightDiameter(BinaryTreeNode<Integer> root){
		if(root == null) return new hd(0,0);
		hd left = heightDiameter(root.left);
		hd right = heightDiameter(root.right);
		int leftHeight = left.height;
		int rightHeight = right.height;
		int leftDiameter = left.diameter;
		int rightDiameter = right.diameter;
		int totalHeight = Math.max(leftHeight,rightHeight)+1;
		int totalDiameter = Math.max(leftDiameter,Math.max(rightDiameter,leftHeight+rightHeight+1));
		return new hd(totalHeight,totalDiameter);
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null) return 0;
		return heightDiameter(root).diameter;
	}
	
}