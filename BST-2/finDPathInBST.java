import java.util.ArrayList;

public class finDPathInBST {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */
    // asked in morgan stanley
	private static ArrayList<Integer> path = new ArrayList<>();
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root == null) return new ArrayList<>();
		if(root.data == data){
			 path.add(root.data);
			 return path;
		}
		if(root.data > data){
			getPath(root.left,data);
			if(path.isEmpty()){
				return new ArrayList<>();
			}else{
				path.add(root.data);
				return path;
			}
		}else{
			getPath(root.right,data);
			if(path.isEmpty()){
				return new ArrayList<>();
			}else{
                path.add(root.data);
				return path;			
			}
		}
	}
}