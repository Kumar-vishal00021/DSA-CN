import java.util.LinkedList;
import java.util.Queue;

public class reverseQueues {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		if(input.isEmpty()) return;
		int data = input.poll();
		reverseQueue(input);
		input.add(data);
	}

}