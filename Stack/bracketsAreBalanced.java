import java.util.*;
public class bracketsAreBalanced {

    public static boolean isBalanced(String e) {
        //Your code goes here
        Stack<Character> st = new Stack<>();
        for(int i=0; i<e.length(); i++){
            char c = e.charAt(i);
            if(c == '('){
                st.push(c);
            }else{
               if(!st.isEmpty()){
                    char top = st.peek();
                    if(top == ')'){
                        return false;
                    }else{
                        st.pop();
                    }
               }else{
                   return false;
               }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}