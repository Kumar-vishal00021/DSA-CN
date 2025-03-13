public class ConstructBST {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	    private static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr,int low,int high,int n){
			if(low == high) {
			   BinaryTreeNode<Integer>root = new BinaryTreeNode<>(arr[low]);
			   return root;
			}
			if(low > high) return null;
			int mid = (low+high)/2;
			BinaryTreeNode<Integer>root = new BinaryTreeNode<>(arr[mid]);
			BinaryTreeNode<Integer> p1 = SortedArrayToBSTHelper(arr ,low,mid-1,n);
			BinaryTreeNode<Integer> p2 = SortedArrayToBSTHelper(arr,mid+1,high,n);
			root.left = p1;
			root.right = p2;
			return root;
		}
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return SortedArrayToBSTHelper(arr,0,arr.length-1,n);
		}
	}