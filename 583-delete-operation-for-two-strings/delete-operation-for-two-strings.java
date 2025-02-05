class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int arr[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    arr[i][j]=j;
                }
                else if(j==0){
                    arr[i][j]=i; 
                   }
                    else if(word1.charAt(i-1) == word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=1+Math.min(arr[i-1][j],arr[i][j-1]);
                }
                    
            }
        }
	return(arr[m][n]);
        
    }
}