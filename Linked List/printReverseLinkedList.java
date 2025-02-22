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


// asked in Citrix

import java.util.Scanner;

public class printReverseLinkedList {

	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if(root == null){
			return;
		}
		// reccursively calling printReverse function till end of linkedList
		printReverse(root.next);
		System.out.print(root.data+" ");
	}
}