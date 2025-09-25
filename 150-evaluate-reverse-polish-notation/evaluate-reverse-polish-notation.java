class Solution {
    public int evalRPN(String[] tokens) {
        
        String str="+-*/";

        Stack<String> st=new Stack<>();

        for(String s:tokens){
            if(!str.contains(s)){
                st.push(s);
            }
            else{
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                switch(s){
                    case "+":
                    st.push(String.valueOf(a+b));
                    break;

                    case "-":
                    st.push(String.valueOf(b-a));
                    break;

                    case "*":
                    st.push(String.valueOf(a*b));
                    break;

                    case "/":
                    st.push(String.valueOf(b/a));
                    break;
                }
            }
        }
        int val=Integer.valueOf(st.pop()); 
        return val;
    }
}