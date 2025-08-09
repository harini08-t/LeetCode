class Solution {
    public int reverse(int x) {
        int neg=1;
        if(x<0){
            neg=-1;
            x*=-1;
        }
        int rev=0,sam=x;
        while(x>0){
            int rem=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow on positive side
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow on negative side
            }
            rev=rev*10+rem;

            x/=10;

        }
        // if(temp > Integer.MAX_VALUE)
        // {
        //      return 0;

        // }
        //  else{
        

        // return temp*neg;
        //  }
        return rev*neg;
    }
}