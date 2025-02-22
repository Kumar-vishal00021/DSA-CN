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

public class deleteNodeRecursively {


	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        // approach 1
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        if(pos < 0){
            return head;
        }
        Node<Integer> smallerAns = deleteNodeRec(head.next,pos-1);
        head.next = smallerAns;

        // approach 2

        //  if(head == null){
        //     return head;
        // }
    //    Node<Integer> curr = head;
    //    int count =0;
    //    while(curr != null){
    //        count++;
    //        curr = curr.next;
    //    }
    //    if(pos >= count){
    //        return head;
    //    }
    //     if(pos == 0 ){
    //         head = head.next ;
    //         return head;
    //     }
    //     if(pos == 1 ){
    //         if(head.next.next == null){
    //             head.next = null;
    //         }else{
    //             head.next = head.next.next;
    //         }
    //         return head;
    //     }
       
    //     deleteNodeRec(head.next,pos-1);
        return head;
	}

}