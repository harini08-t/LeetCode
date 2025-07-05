class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mp=new HashSet<>();

        for(int a:nums){
            if(mp.contains(a)){
                return true;
            }
            mp.add(a);

        }
        return false;

        
    }
}