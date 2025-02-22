import java.util.*;
public class reverseStackSolution {
	public static void reverseStackHelper(Stack<Integer> input, Stack<Integer> extra){
		if(input.isEmpty()){
			return;
		}
		int top = input.pop();
		reverseStackHelper(input,extra);
		extra.push(top);
	}

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		reverseStackHelper(input,extra);
		while(! extra.isEmpty()){
			input.push(extra.pop());
		}
	}
}
