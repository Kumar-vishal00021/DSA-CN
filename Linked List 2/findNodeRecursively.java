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

public class findNodeRecursively {

    public static int ind = 0;
     public static int findNodeRec(Node<Integer> head, int n) {
         //Your code goes here
         if(head == null){
             return -1;
         }
         if(head.data == n){
             return ind;
         }
         ind++;
         int ans = findNodeRec(head.next,n);
         return ans;
     }
 
 }