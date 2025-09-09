class Solution {
    public static int upper(int[] arr, int t,int n){
        int l=0,h=n-1,ans=n;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid] > t){
                ans=mid;
                h=h-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }

     public static int lower(int[] arr, int t,int n){
        int l=0,h=n-1,ans=n;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid] >= t){
                ans=mid;
                h=h-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int n=nums.length;

        int lb=lower(nums,target,n);
        if(lb==n || nums[lb]!=target)
        return new int[]{-1,-1};

        int up=upper(nums,target,n);

        return new int[]{lb,up-1};

        
    }
}