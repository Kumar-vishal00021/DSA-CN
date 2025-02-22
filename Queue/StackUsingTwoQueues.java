import java.util.*;
public class StackUsingTwoQueues {

    //Define the data members
    int size;
     Queue<Integer> q1;
    Queue<Integer> q2 ;
    

    public StackUsingTwoQueues() {
        //Implement the Constructor
        this.q1 =  new LinkedList<>();
        this.q2 =  new LinkedList<>();
        size =0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(isEmpty()) return -1;
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int ans = q1.remove();
        while(! q2.isEmpty()){
            q1.add(q2.remove());
        }
        size--;
        return ans;
    }

    public int top() {
        //Implement the top() function
          if(isEmpty()) return -1;
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int ans = q1.remove();
        q2.add(ans);
        while(! q2.isEmpty()){
            q1.add(q2.remove());
        }
        return ans;
    }
}