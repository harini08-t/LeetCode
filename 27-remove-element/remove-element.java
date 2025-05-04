class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
       int i=0,j=nums.length-1;
        
        while(i<j){
            if(nums[i]==val){
              //  count++;

                while(nums[j]==val && i<j)
                {
                    j--;
                 //   count++;
                }

                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j--;
                
               // else
            }
            i++;

        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==val){
                count++;
            }
        }

        return nums.length - count;
        
    }
}