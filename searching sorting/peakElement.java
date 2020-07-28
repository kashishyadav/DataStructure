class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n){
		return peakSearch(a,0,n-1,n);
	}
	
	
    public int peakSearch(int arr[],int low,int high,int n)
    {
        int mid=(low+high)>>1;
        if((mid==0||arr[mid-1]<=arr[mid] )&& (mid==n-1 || arr[mid+1]<=arr[mid]))
        return mid;
        else if(mid>0 && arr[mid-1]>arr[mid])
        return peakSearch(arr,0,mid-1,n);
        else
        return peakSearch(arr,mid+1,high,n);
    }
}
