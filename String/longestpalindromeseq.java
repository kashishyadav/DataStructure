class Solution {
    public int longestPalindromeSubseq(String s) {
     
        return lps(s,0,s.length()-1);
        int len=s.length();
        Integer arr[][]=new Integer[len][len];
        return lpsTopDown(s,0,len-1,arr);
        return lpsBottomUp(s,s.length());
    }
    public int lpsBottomUp(String str,int n)
    {
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
            arr[i][i]=1;
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    arr[i][j]=2+arr[i+1][j-1];
                    
                }
                else
                {
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
                 
            }
        }
        return arr[0][n-1];
    }
    public  int lpsTopDown(String str,int start,int end,Integer arr[][])
    {

        if(start>end)
            return 0;
        if(start==end)
            return 1;
        
        if(arr[start][end]==null)
        {
            if(str.charAt(start)==str.charAt(end))
            {
                arr[start][end]=2+lpsTopDown(str,start+1,end-1,arr);
                
            }
            else
            {
arr[start][end]=Math.max(lpsTopDown(str,start+1,end,arr),lpsTopDown(str,start,end-1,arr));
            }
        }
        return arr[start][end];
    }
        
 
    
    public static int lps(String str, int start, int end) {
    if(start > end) {
      return 0;
    }
    
    if(start == end) {
      return 1;
    }
    
    if(str.charAt(start) == str.charAt(end)) {
      return 2 + lps(str, start + 1, end - 1);
    } 
    
    return Math.max(lps(str, start + 1, end), lps(str, start, end - 1));
  }
}
