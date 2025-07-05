class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mp=new HashSet<>();

        for(int a:nums){
            if(!mp.add(a)){
                return true;
            }

        }
        return false;

        
    }
}