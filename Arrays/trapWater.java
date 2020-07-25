class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
      public int trap(int[] arr) {
        
        int n=arr.length;
        int left=0,res=0;
        for(int i=1;i<n-1;i++)
        {
            left=arr[i];
            for(int j=0;j<i;j++)
            {
                left=Math.max(left,arr[j]);
            }
            int right=arr[i];
            for(int k=i+1;k<n;k++)
            {
                right=Math.max(right,arr[k]);
            }
            res+=(Math.min(left,right)-arr[i]);
        }
                  return res;
    }
    //0(n) solution....
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
          // int n=arr.length;
        int res=0;
        int left[]=new int[n];
        int right[]=new int[n];
        
        left[0]=arr[0];
            for(int j=1;j<n;j++)
            {
                left[j]=Math.max(left[j-1],arr[j]);
            }
             right[n-1]=arr[n-1];
            for(int k=n-2;k>=0;k--)
            {
                right[k]=Math.max(right[k+1],arr[k]);
            }
        for(int i=0;i<n;i++)
        {
        
            res+=(Math.min(left[i],right[i])-arr[i]);
        }
                  return res;
    
    } 
}
