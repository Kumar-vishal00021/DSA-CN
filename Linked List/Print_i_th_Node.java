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

public class Print_i_th_Node {

    public static void printIthNode(Node<Integer> head, int i){
        int pos = 0;
		Node curr = head;
		while(curr != null){
			if(pos == i){
				System.out.print(curr.data);
				return;
			}
			curr = curr.next;
			pos++;
		}
    }
}