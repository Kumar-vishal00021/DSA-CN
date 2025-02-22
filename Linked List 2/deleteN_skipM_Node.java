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


import java.util.ArrayList;

public class deleteN_skipM_Node {
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {
		//Your code goes here
        if(n == 0){
            return head;
        }
        if(m == 0){
            return null;
        }
        if(head == null){
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> temp = null;
        while(curr != null){
            for(int i=1; i<m && curr != null;  i++){
                curr = curr.next;
            }
            if(curr == null){
                break;
            }
            temp = curr.next;
            for(int i=1; i<=n && temp != null;  i++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        return head;
	}
}