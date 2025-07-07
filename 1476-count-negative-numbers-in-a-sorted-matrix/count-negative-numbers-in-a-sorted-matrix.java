class Solution {
    public int countNegatives(int[][] grid) {

        int n=grid.length,m=grid[0].length;
        int i=0,j=m-1,total=0;

        while(i<n && j>=0){
            if(grid[i][j]>=0){
                i++;
            }
            else{
                total+=(n-i);
                j--;

            }
        }
        return total;


        
    }
}