class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> mp=new HashMap<>();
        int count=0;

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            if(mp.getOrDefault(nums[i],0) > n){
                return nums[i];


            }

        }




        return -1;
    }
}