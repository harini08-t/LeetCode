class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==a){
                return true;
            }
            a=nums[i];
        }
        return false;
        
    }
}