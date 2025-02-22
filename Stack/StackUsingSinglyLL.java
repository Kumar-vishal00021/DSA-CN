
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

public class StackUsingSinglyLL {

    //Define the data members
    private int size;
    private Node head;

    // Constructor to initialize an empty stack
    public StackUsingSinglyLL() {
        size = 0;
        head = null;
    }


  Node stack = null;

    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if(size == 0){
            return true;
        }
        return false;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(isEmpty()){
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int top() {
        //Implement the top() function
        if(!isEmpty()){
            return head.data;
        }
        return -1;
    }
}