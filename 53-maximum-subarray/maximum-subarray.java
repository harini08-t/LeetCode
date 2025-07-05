class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int maxi=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            maxi=Math.max(curr,maxi);
        }
        return maxi;
    }
}