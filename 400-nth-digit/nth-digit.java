class Solution {
    public int findNthDigit(int n) {

        int len=1;
        long digi=9;
        long start=1;

        while( n > len*digi){
            n-=len*digi;
            len++;
            digi*=10;
            start*=10;
        }
        long num=start +(n-1)/len;
        String str=Long.toString(num);


        return str.charAt((int)(n-1)%len) -'0';

    }
}