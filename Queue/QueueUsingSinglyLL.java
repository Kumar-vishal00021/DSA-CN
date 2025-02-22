/*
	Following is the structure of the node class for a Singly Linked List

	
	*/
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

public class QueueUsingSinglyLL {
	
	//Define the data members
    int size;
	Node head,tail;

	public QueueUsingSinglyLL() {
		//Implement the Constructor
		this.head = null;
		this.tail = null;
		size = 0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			tail = newNode;
		}
		size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if(isEmpty()) return -1;
		Node data = head;
		head = head.next;
        data.next = null;
		size--;
		return data.data;
    }


    public int front() {
    	//Implement the front() function
		if(isEmpty()) return -1;
		return head.data;
    }
}
