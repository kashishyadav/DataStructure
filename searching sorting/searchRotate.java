class Solution 
{ 
    static int Search(int arr[], int target)
	{
	    // code here
	    int pi= binarySearch(arr,0,arr.length-1,target);
	   // System.out.println("pi: "+pi);
	    return pi;
	    
	}
	static int binarySearch(int arr[],int low,int high,int key)
	{
	    if(low>high)
	    return -1;
	    
	    int mid=(low+high)/2;
	    if(arr[mid]==key)
	    return mid;
	    
	   if(arr[low]<=arr[mid])
	   {
	       if(key<=arr[mid] && key>=arr[low])
	       {
	           return binarySearch(arr,low,mid-1,key);
	       }
	       
	       return binarySearch(arr,mid+1,high,key);
	   }
	   if(key>=arr[mid] && key <=arr[high])
	   return binarySearch(arr,mid+1,high,key);
	   
	   return binarySearch(arr,low,mid-1,key);
	   
	}
} 
