//import java.util.*;
class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <=4){
            return 0;
        }
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        

        int i=0,j=n-3-1;
        while(i<=3 && j<n){
            int a=nums[i];
            int b=nums[j];
            int c=Math.abs(a-b);
            if(c <min){
                min=c;
            }
            i++;
            j++;
        }
        return min;
    }
}