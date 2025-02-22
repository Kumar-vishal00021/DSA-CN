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
// asked in Amazon

public class MergeSortLL {
    public static Node<Integer> midPoint(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast !=null && fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> mid = midPoint(head);
        Node<Integer> right = mid.next;
        mid.next = null;
        Node<Integer>problem1= mergeSort(head);
        Node<Integer>problem2= mergeSort(right);
        return merge(problem1,problem2);
	}

    public static Node<Integer> merge(Node<Integer>head1,Node<Integer>head2){
         if(head1 == null ){
            return head2;
        }
        // if list 2 is empty return list1
        if(head2 == null){
            return head1;
        }
         Node<Integer> curr = null;
         Node<Integer> head = null;
        Node<Integer> c1 = head1;
        Node<Integer> c2 = head2;
        while(c1 != null && c2 != null){
            if(c1.data < c2.data){
                if(head == null){
                  head = c1;
                  curr=c1;
                  c1=c1.next;
                }else{
                    curr.next = c1;
                    curr = curr.next;
                    c1 = c1.next;
                }
            }else{
                if(head == null){
                    head = c2;
                    curr = c2;
                    c2 = c2.next;
                }else{
                    curr.next = c2;
                    curr = curr.next;
                    c2 = c2.next;
                }
            }
        }
        while(c1 != null){
            curr.next = c1;
            break;
        }
        while(c2 != null){
            curr.next = c2;
            break;
        }
      return head;
     }

}
