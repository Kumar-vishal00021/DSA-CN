/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class CountNodesSolution {
    public static int length(Node head){
        //Your code goes here
        int counter = 0;
        Node curr = head;
        while(curr != null){
            counter++;
            curr = curr.next;
        }
        return counter;
    }
}