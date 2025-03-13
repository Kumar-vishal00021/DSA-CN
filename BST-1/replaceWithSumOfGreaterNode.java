public class replaceWithSumOfGreaterNode {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */
    private static int sum = 0;
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root == null) return;
		replaceWithLargerNodesSum(root.right);
		sum += root.data;
		root.data = sum;
		replaceWithLargerNodesSum(root.left);
	}
}