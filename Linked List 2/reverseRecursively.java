
/*

    Following is the Node class already written for the Linked List

    
    */
    class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }
public class reverseRecursively {

	public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here 
        if(head==null || head.next == null){
            return head;
        }
        Node<Integer> smallAns = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return smallAns;
	}
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(2);
        Node<Integer> n1 = new Node<>(3);
        head.next = n1;
        Node<Integer> n2 = new Node<>(4);
        n1.next = n2;
        Node<Integer> n3 = new Node<>(5);
        n2.next = n3;
        head = reverseRec(head);
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    

}