// Last updated: 7/14/2026, 2:02:22 PM
class MyStack {
    Queue<Integer>st;
    Queue<Integer>q1;

    public MyStack() {
        st=new LinkedList<>();
        q1=new LinkedList<>();


        
    }
    
    public void push(int x) {
        st.add(x);
        for(int i=0;i<st.size()-1;i++){
            st.add(st.remove());
        }


        
    }
    
    public int pop() {
       return  st.remove();
    
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public boolean empty() {
        return st.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */