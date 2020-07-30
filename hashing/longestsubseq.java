class GfG
{
    
    // Function to find Longest Consecutive Subsequence
    int findLongestConseqSubseq(int arr[], int n)
    {
        
	    // Your code here
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	        list.add(arr[i]);
	    }
	    int count=1,ans=1;
	    Collections.sort(list);
	    for(int i=0;i<n-1;i++)
	    {
	        int prev=list.get(i)+1;
	        int j=i+1;
	        int next=list.get(j);
	        if(prev-1==next)
	        continue;
	        if(prev==next)
	         {
	             ++count;
	             if(i==n-2 && ans<count)
	             {
	                 ans=count;
	             }
	         }
	         else
	          {
	              if(count>ans)
	              {
	                  ans=count;
	              }
	              
	              count=1;
	          }
	         
	         
	    }
	    return ans;
	    
    }
}
