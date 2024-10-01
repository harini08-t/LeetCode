class Solution {
    public boolean isValid(String s) {
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char c=(char)st.pop();
                char a=s.charAt(i);
                if((c=='(' && a==')') ||(c=='[' && a==']') || (c=='{' && a=='}') ){

                }
                else{
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