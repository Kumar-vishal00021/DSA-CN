import java.util.*;
public class checkRedundantBracket {

	public static boolean checkRedundantBrackets(String e) {
		//Your code goes here
		Stack<Character> st = new Stack<>();
		int n = e.length();
		int count = 0;
		for(int i=0; i<n; i++){
			char c = e.charAt(i);
			count = 0;
			if(c != ')'){
				st.push(c);
			}else{
				if(st.isEmpty()){
					return true;
				}else{
					char top = st.peek();
					if(top == '(') return true;
				    while(top != '('){
							count++;
							st.pop();
							top = st.peek();
					}
					st.pop();
				}
			}
		}
			if(count <=1){
				return true;
			}else{
				return false;
			}
	}
}