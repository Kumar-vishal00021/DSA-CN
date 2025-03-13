public class BSTtoLL {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
    private static LinkedListNode<Integer> head = null;
    private static LinkedListNode<Integer> curr = null;
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if(root == null) return null;
		// check if BST id empty then return null
		constructLinkedList(root.left);
		// traverse to the left most in BST that means smallest element of BST
		LinkedListNode<Integer> newNode =new LinkedListNode<>(root.data);
		// creat the node with the smallest element
		if(head == null){
			// check is this first node of linkedList 
			head = newNode;
			curr = newNode;
		}else{
			curr.next = newNode;
			curr = newNode;
		}
		// traverse to the right most BST it means biggest element of BST 
		constructLinkedList(root.right);
		return head;
	}
}