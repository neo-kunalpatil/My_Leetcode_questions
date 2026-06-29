import java.util.*;
class MyQueue {
    Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        st.push(x);
        
    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        if(st2.isEmpty()) {
            while(!st.isEmpty()) {
            st2.push(st.pop());
            }

        }
        return st2.pop();
        
    }
    
    public int peek() {
        if(empty()) {
            return -1;
        }

          if(st2.isEmpty()) {
            while(!st.isEmpty()) {
            st2.push(st.pop());
            }

        }
        return st2.peek();
        
    }
        
        
    
    
    public boolean empty() {
        return st2.isEmpty() && st.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */