class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int m1=0;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            m1+=arr[i];
            
            m2=Math.max(m1,m2);
            
            if(m1<0)
            m1=0;
            
           
        }
        return m2;
    }
    
    int maxSubarraySum(int arr[], int n){
        int curr=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(curr,max);
        }
        return max;
    }
    
}
