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

public class swapTwoNodes {

	public static Node<Integer> swapNodes(Node<Integer> head, int x, int y) {
		//Your code goes here
        if(head == null){
            return head;
        }
        if(x > y){
            int t = x;
            x = y;
            y = t;
        }
        int index =0;
        Node<Integer> prev1 = null,curr1 = head;
        Node<Integer> prev2 = null,curr2 = head;
        while(curr1 != null && index < x){
            prev1 = curr1;
            curr1 = curr1.next;
            index++;
        }
        index =0;
        while(curr2 != null && index<y){
            prev2 = curr2;
            curr2 = curr2.next;
            index++;
        }
        
        // if in any case x or y is greater than linked list 
        if( curr2 ==null || curr1 == null){
            return null;
        }
        
        if(y-x == 1){
            if (x == 0){
                head = curr2;
                curr1.next = curr2.next;
                curr2.next = curr1;
            }else{
                prev1.next = prev2.next;
                curr1.next = curr2.next;
                curr2.next = curr1;
            }
        }else{
             if (x == 0){
                Node<Integer> temp = curr2.next;
                head = curr2;
                curr2.next = curr1.next;
                curr1.next = temp;
                prev2.next = curr1;
            }else{
                Node<Integer> temp = curr2.next;
                prev1.next =curr2;
                curr2.next = curr1.next;
                prev2.next = curr1;
                curr1.next = temp;
            }
        }       
        return head;
	}

}