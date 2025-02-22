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

public class appendLastNToFirstLL {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		int count =0;
		Node<Integer> current = head;
		Node<Integer> lastNode = null;
		Node<Integer> prevCurrent = null;
		// checking the length of linked list 
		while(current != null){
			if(current.next == null){
				lastNode = current;
			}
			count++;
			current = current.next;
		}
		if(count == 0){
			return null;
		}else if(count == 1 || n == count){
			return head;
		}else {
			// calculating position which has to make head 
			int pos = count - n;
			count =0;
			current = head;
			while(current != null){
				if(pos == count){
					lastNode.next = head;
					head = current;
					// making prevCurrent to last node which is previous node from pos
					prevCurrent.next = null;
					return head;
				}
				count++;
				prevCurrent = current;
				current = current.next;
			}
		}
		return head;
	}

}