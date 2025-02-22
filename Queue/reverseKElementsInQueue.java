
import java.util.*;

public class reverseKElementsInQueue {
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i<k; i++){
			s.push(input.remove());
		}
		for(int i= 0; i<k; i++){
			input.add(s.pop());
		}
		for(int i=0; i<input.size()-k; i++){
			input.add(input.remove());
		}
		return input;
	}

}