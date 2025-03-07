/*

	Following is the Binary Tree Node class structure.

	
	*/
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

 public class sumOfNode {

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root == null) return 0;
		return getSum(root.left) + getSum(root.right) + root.data;
	}

}