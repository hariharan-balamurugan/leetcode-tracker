// Last updated: 7/14/2026, 2:01:27 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st =new Stack<>();
        int sum=0;
        for(String n:operations){
            if(n.equals("+")){
                 int a =st.pop();
                 int b=st.peek();
                 st.push(a);
                 st.push(a+b);


            }else if(n.equals("D")){
                st.push(2*st.peek());
           

        }else if(n.equals("C")){
            st.pop();
        }
        else{
            st.push(Integer.parseInt(n));
        }
        
    }

    while(!st.isEmpty()){
        sum+=st.peek();
        st.pop();
    }

    return sum;
}
}