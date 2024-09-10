class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            int n=arr[i];
            while(n>0){
                nums[j]=i;
                j++;
                n--;
            }
        }

        
    }
}