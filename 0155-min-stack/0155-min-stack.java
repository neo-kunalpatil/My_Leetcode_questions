import java.util.*;
class MinStack {
   Stack<Long> st = new Stack<>();
long minval;

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()) {
            st.push((long)value);
            minval=value;
        }
        else if(value <minval) {
         st.push(2L*value-minval);
         minval=value;
        }
        else {
            st.push((long)value);
        }

        
    }
    
    public void pop() {
         if(st.isEmpty()) {
           return;
        }
        long c= st.pop();
        if(c<minval) {
            minval= 2*minval-c;
        }
      

        
    }
    
    public int top() {
        if(st.isEmpty()) {
           return -1;
        }

        if(st.peek() <minval) {
            return (int)minval;
        }
        else  {
            return st.peek().intValue();
        }

        
    }
    
    public int getMin() {
        if(st.isEmpty()) 
           return -1;
        
        return (int)minval;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */