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
class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

public class InsertNode {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		int count = 0;
        Node current = head;
		Node lastNode = null;
		// check the length of linked list 
        while (current != null) {
            count++;
			// check if node is last then keep the refrence of it in lastNode 
			if(current.next == null){
				lastNode = current;
			}
			current = current.next;
        }
		if(pos > count){
			return head;
		}
		// create a node that is to be insert 
		Node newNode = new Node(data);
		// if pos is 0 then insert at 0 pos and poin head to it 
		if(pos == 0){
			newNode.next = head;
			head = newNode;
			// if pos is last then insert 
		}else if(pos == count){
           lastNode.next = newNode;
		}else{
			current = head;
			count=0;
			while(current != null){
				if(count == pos-1){
					newNode.next = current.next;
					current.next = newNode;
					return head;
				}
				current = current.next;
				count++;
			}
		}
		return head;
	}
}