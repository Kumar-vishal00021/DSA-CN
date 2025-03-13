public class LCA_Of_BSt {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null) return -1;
		// if the BST is null return -1
		if(root.data >= a && root.data<=b) return root.data;
		// if the root data is greater than left BST and less than right BST 
		// it means this is the node that will be LCA 
		if(root.data >=a) return getLCA(root.left,a,b);
		// check if the root data is smaller than a it means a is present in Left BST
		else return getLCA(root.right,a,b);
		// check if the root data is smaller than a it means a is present in Light BST
	}
}