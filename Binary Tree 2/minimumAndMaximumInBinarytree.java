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



/*

	Representation of the Pair Class


	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}
*/
// asked in Adobe
public class minimumAndMaximumInBinarytree {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null) return new Pair<Integer, Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);
		Pair<Integer, Integer> left = getMinAndMax(root.left);
		Pair<Integer, Integer> right = getMinAndMax(root.right);
		int minLST = left.minimum;
		int minRST = right.minimum;
		int min = Math.min(minLST,Math.min(minRST,root.data));

		int maxLST = left.maximum;
		int maxRST = right.maximum;
		int max = Math.max(maxLST,Math.max(maxRST,root.data));
		return new Pair<Integer, Integer>(min,max);
	}
	
}