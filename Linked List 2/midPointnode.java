/*

    Following is the Node class already written for the Linked List
*/class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class midPointnode {
    
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

}