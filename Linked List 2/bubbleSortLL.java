/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class bubbleSortLL {

	public static Node<Integer> bubbleSort(Node<Integer> head) {
		//Your code goes here
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> curr = head;
		while(curr.next != null){
			Node<Integer> curr2 = curr.next;
			while(curr2 != null){
				if(curr.data > curr2.data){
					int temp = curr.data;
					curr.data = curr2.data;
					curr2.data = temp;
				}
				curr2 = curr2.next;
			}
			curr = curr.next;
		}
		return head;
	}
}