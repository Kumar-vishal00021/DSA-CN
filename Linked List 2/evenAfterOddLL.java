import java.util.ArrayList;
import java.util.List;

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

public class evenAfterOddLL {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        
        // Step 1: Traverse and collect odd and even values separately.
        List<Integer> oddValues = new ArrayList<>();
        List<Integer> evenValues = new ArrayList<>();
        
        Node<Integer> current = head;
        while (current != null) {
            if (current.data % 2 != 0) {  // odd number
                oddValues.add(current.data);
            } else {  // even number
                evenValues.add(current.data);
            }
            current = current.next;
        }
        
        // Step 2: Traverse again and overwrite the data.
        current = head;
        // First write odd numbers.
        for (int val : oddValues) {
            current.data = val;
            current = current.next;
        }
        // Then write even numbers.
        for (int val : evenValues) {
            current.data = val;
            current = current.next;
        }
        
        return head;
    }
}
