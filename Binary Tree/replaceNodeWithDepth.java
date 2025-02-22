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

public class replaceNodeWithDepth {
    public static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root,int d){
        if(root == null) return;
        root.data = d;
        changeToDepthTreeHelper(root.left,d+1);
        changeToDepthTreeHelper(root.right,d+1);
    }
     public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
         //Your code goes here
         changeToDepthTreeHelper(root,0);
     }
 
 }