class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String i:tokens){
            if(!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")){
                st.push(Integer.parseInt(i));
            }
            else{
                
                    int num1=st.pop();
                    int num2=st.pop();
                    if(i.equals("+")){
                        st.push(num1+num2);
                    }
                    else if(i.equals("-")){
                        st.push(num2-num1);
                    }
                    else if(i.equals("*")){
                        st.push(num1*num2);
                    }
                    else{
                        st.push(num2/num1);
                    }
                
            }
        }
        return st.pop();
        
    }
}
