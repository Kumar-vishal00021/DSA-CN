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
// asked in Wolters Kluwer
public class mergeTwoSortedLL {
    
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        // if list one is empty return list2
        if(head1 == null ){
            return head2;
        }
        // if list 2 is empty return list1
        if(head2 == null){
            return head1;
        }
        Node<Integer> c1 = head1;
        Node<Integer> c2 = head2;
        Node<Integer> head = null;
        Node<Integer> c =null;
        while(c1 != null && c2 != null){
            // if data of list 1 is smaller than data of list 2
            if(c1.data < c2.data){
                // if head is null then set the first element.
                if(head == null){
                    head = c1;
                    c = c1;
                    c1=c1.next;
                }else{
                    c.next=c1;
                    c=c.next;
                    c1=c1.next;
                }
                 // if data of list 2 is smaller than data of list 1
            }else{
                // if head is null then set the first element.
                if(head == null){
                    head = c2;
                    c = c2;
                    c2=c2.next;
                }else{
                    c.next=c2;
                    c=c.next;
                    c2=c2.next;
                }
            }
        }
        // when list 1 is still some node but list 2 is ended
        // we are using  break because next list is connected so no need to traverse unnessesarly
        while(c1 != null ){
            c.next = c1;
            break;
        }
        // when list 2 is still some node but list 1 is ended
        while(c2 != null){
            c.next = c2;
            break;
        }
        return head;
    }

}