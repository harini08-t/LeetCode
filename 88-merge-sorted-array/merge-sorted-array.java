class Solution {
   // int arr[]=new int[]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[n+m];
        int i=0,j=0;
        int ind=0;
        while(i< m && j<n){
            if(nums1[i]<nums2[j]){
                arr[ind++]=nums1[i];
                i++;
            }
            else{
                arr[ind++]=nums2[j];
                j++;
            }
            // else{
            //     arr[ind++]=nums1[i];
            //     arr[ind++]=nums1[i];
            //     i++;
            //     j++;

            // }
        }
        while(i<m){
            arr[ind++]=nums1[i++];
        }
        while(j<n){
            arr[ind++]=nums2[j++];
        }
       // return arr;
       //nums1=Arrays.copyOf(arr,m+n);
       for(int k=0;k<n+m;k++){
        nums1[k]=arr[k];
       }
        
    }
}