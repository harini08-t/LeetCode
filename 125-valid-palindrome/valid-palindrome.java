class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)||Character.isDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        String s1=str.toString();
        String s2=str.reverse().toString();

        if(s1.equals(s2))
        return true;

       // System.out.println(s1+" "+s2);
        
        return false;
    }
}