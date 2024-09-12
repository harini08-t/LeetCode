class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=0,sample=x;
        while(x>0){
            int rem=x%10;
            temp=temp*10+rem;
            x/=10;
        }
        return (temp==sample);

        
    }
}