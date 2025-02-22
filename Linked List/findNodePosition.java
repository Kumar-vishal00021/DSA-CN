/****************************************************************

	Following is the class structure of the Node class:

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/


// asked in Hewlett Packard,Cadence Design,Betsol,RTDS,Oodles Tech
public class findNodePosition {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		int count =0;
		Node<Integer> current = head;
		// checking the length of linked list 
		while(current != null){
			count++;
			current = current.next;
		}
		if(count == 0){
			return -1;
		}else if(count == 1){
			if( current.data == n) return 1;
			return -1;
		}else{
			count = 0;
			current = head;
			while(current != null){
				if(current.data.equals(n)) return count;
				count++;
				current = current.next;
			}
		}
		return -1;
	}
}