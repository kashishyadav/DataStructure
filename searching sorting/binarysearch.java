class GfG
{
	int bin_search(int arr[], int low, int high,  int k)
	{
		// Your code here
		if(low>high)
		return -1;
		    int mid=(low+high)/2;
		  
		    if(arr[mid]==k)
		    {
		        return mid;
		    }
		    else if(arr[mid]>k)
		    return bin_search(arr,low,mid-1,k);
		    else
		    return bin_search(arr,mid+1,high,k);
	}
	int bin_search(int arr[], int low, int high,  int k)
	{
		    while(low<=high)
		    {
		        int mid=(low+high)>>1;
		        if(arr[mid]==k)
		        return mid;
		        else if(arr[mid]>k)
		        high=mid-1;
		        else
		        low=mid+1;
		        
		    }
		    return -1;
	
	}
}
