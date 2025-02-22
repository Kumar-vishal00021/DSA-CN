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

public class isLinkedListPalindrome {
    //   this is the globa variable it will not be change untill we change it.
       public static Node<Integer> curr = null;
    
        public static boolean isPalindrome(Node<Integer> head) {
            //Your code goes here 
            if(head == null ){
                return true;
            }
            if(curr == null){
                // here we are setting global var to head
                curr = head;
            }
            // recursively calling isPalindrome untill end of ll
            isPalindrome(head.next);
            // currently curr is pointing to statrt and head pointing to  end
            // because of recursively 
            if(curr.data == head.data){
                // it check if the first and last is equal
                // then move curr to next and by default recursion move head to prev
                curr = curr.next;
                return true;
            }
            return false;
        }
    
    }