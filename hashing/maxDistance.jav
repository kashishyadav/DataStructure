class GfG
{
    int maxDistance(int arr[], int n)
    {
	// Your code here
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<n;i++)
	{
	    if(!hm.containsKey(arr[i]))
	    hm.put(arr[i],i);
	}
	int distance=Integer.MIN_VALUE;
	for(int i=arr.length-1;i>=0;i--)
	{
	    int res=hm.get(arr[i]);
	    if(hm.containsKey(arr[i]))
	    {
	        
	        res=i-res;
	    }
	    if(res>distance)
	    distance=res;
	}
	return distance;
    }
}
