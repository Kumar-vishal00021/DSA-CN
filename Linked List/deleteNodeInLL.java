/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/
// asked in Qulcomm,Zomato,Goldman Sachs,Acko,Adobe,Paypal,Paytm,Feshworks,Samsung,CIS-Cyber Infra,
// Amazon,Myntra,optum,OYO,OLX Group,Groww,Nagarro,Aricent Tech,SourceFuse Tech,Comviva,D.E.Shaw,
// TCS,BYJUS,Accolite,Bajaj Electricals,Cadence,Gameskraft,Mindtree,Ascendion,HashedIn.
public class deleteNodeInLL {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		int count =0;
		Node current = head;
		// checking the length of linked list 
		while(current != null){
			count++;
			current = current.next;
		}
		// checking if the pos is greate then or equal to length then do nothing
		if(pos >= count){
			return head;
		}else if(pos == 0){
			// in case of pos 0 and length of list is 1,
			//  it means after deletion of 0th positin node Linkedlist wil be empty
			if(count == 1){
				head = null;
			}else{
				// in case length of linked list is greater than 1 and pos is 0,
				// it means pos 1 will be the pos 0 after deleteNode.
				head = head.next;
			}
			return head;
		}else{
			count = 0;
			current = head;
			while(current != null){
				if(count == pos-1){
					current.next = current.next.next;
					return head;
				}
				count++;
				current = current.next;
			}
		}
		return head;
	}
}
