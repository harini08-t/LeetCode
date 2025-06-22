class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            int a=nums[i];
            if(k%a!=0)continue;
            for(int j=i;j<n;j++){
                int y=nums[j];
                a=lcm(a,y);
                if(a>k)break;
                if(k%a!=0)continue;

                if(a==k)
                count++;
            }
        }
        return count;

        
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static int gcd(int a,int b){
        return (b==0) ? a:gcd(b,a%b);
    }
}