class Solution {
    public void rotate(int[] nums, int k) {
         k=k % nums.length;
        int len=nums.length;

        rotate(nums,0,len-1);
        rotate(nums,0,k-1);
         rotate(nums,k,len-1);
       //  return nums;
        
    }
    public static int[] rotate(int arr[],int a,int b){
        for(int i=a,j=b;i<j;i++,j--)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;

        }
        return arr;
    }
}