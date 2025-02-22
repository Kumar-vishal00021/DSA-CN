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

public class EliminateDuplicates {

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		int count =0;
		Node<Integer> current = head;
		// checking the length of linked list 
		while(current != null){
			count++;
			current = current.next;
		}
		if(count == 0){
			return null;
		}else if(count == 1){
			return head;
		}
		// here starting two pointer one from index 0 and other from index 1
		Node<Integer> prevNode = head; // startin from index 0.
		current = head.next; //startin from index 1.
		while(current != null){
			// here comparing prev and current if both's data are equals 
			// then move only current pointer to next else move current and prev both
			if(prevNode.data.equals(current.data)){
				prevNode.next = current.next;
			}else{
				prevNode = prevNode.next;
			}
			current = current.next;
		}
		
	return head;
	}

}