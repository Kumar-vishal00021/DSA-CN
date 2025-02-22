// /*

//     Following is the Node class already written for the Linked List

//     class Node<T> {
//         T data;
//         Node<T> next;
    
//         public Node(T data) {
//             this.data = data;
//         }
//     }

// */

// approach 1

public class kReverse {
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		// Your code goes here
        if (k==0 || k==1) {
            return head;
        }
        if (head == null) {
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> nextHead = null;
        Node<Integer> prevHead = null;
        int c = 0;
        while(curr != null && c < k){
            nextHead = curr.next;
            curr.next = prevHead;
            prevHead = curr;
            curr = nextHead;
            c++;
        }
        if(nextHead != null){
            head.next = kReverse(nextHead,k);
        }
        return prevHead;
	}
}








// approach 2




// public class Solution {
//     public static HeadAndTail reverse(Node<Integer> head) {
//         if (head==null || head.next==null) {
//             // the LL has either 0 or 1 node
//             HeadAndTail ans = new HeadAndTail(head, head);
//             return ans;
//         }
//         HeadAndTail smallerProblem = reverse(head.next);
//         head.next = null;
//         smallerProblem.tail.next = head;
//         HeadAndTail ans = new HeadAndTail(smallerProblem.head, head);
//         return ans;
//     }

// 	public static Node<Integer> kReverse(Node<Integer> head, int k) {
// 		//Your code goes here
//         if (k==0 || k==1) {
//             return head;
//         }
//         if (head==null) {
//             return head;
//         }
//         Node<Integer> localHead = head;
//         Node<Integer> localTail = head;
//         Node<Integer> previousTail = null;
//         Node<Integer> ans = null;
//         int c = 1;
//         while (localTail!=null) {
//             if (c==k) {
//                 if (ans==null) {
//                     // c==k happened for the very first time
//                     Node<Integer> nextLocalHead = localTail.next;
//                     localTail.next = null;
//                     HeadAndTail kNodesReversed = reverse(localHead);
//                     ans = kNodesReversed.head;
//                     previousTail = kNodesReversed.tail;
//                     previousTail.next = nextLocalHead;
//                     localHead = nextLocalHead;
//                     localTail = nextLocalHead;
//                 } else {
//                     Node<Integer> nextLocalHead = localTail.next;
//                     localTail.next = null;
//                     HeadAndTail kNodesReversed = reverse(localHead);
//                     previousTail.next = kNodesReversed.head;
//                     kNodesReversed.tail.next = nextLocalHead;
//                     previousTail = kNodesReversed.tail;
//                     localHead = nextLocalHead;
//                     localTail = nextLocalHead;
//                 }
//                 c = 1;
//             }
//             if (localTail==null) {
//                 return ans;
//             }
//             localTail = localTail.next;
//             ++c;
//         }
//         // if (c>1 && c<k) {
//             Node<Integer> temp = previousTail.next;
//             HeadAndTail kNodesReversed = reverse(temp);
//             kNodesReversed.tail.next = null;
//             previousTail.next = kNodesReversed.head;
//         // }
//         return ans;
// 	}
// }


































