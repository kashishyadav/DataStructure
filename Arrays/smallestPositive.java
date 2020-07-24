class FindMissing{
    
    // Function to find 
    static int findMissing(int arr[], int n)
    {
       
       // Your code here
       boolean b[]=new boolean[n+1];
       for(int i=0;i<n;i++)
       {
           if(arr[i]>0 && arr[i]<=n)
           b[arr[i]]=true;
           
       }
       for(int i=1;i<=n;i++)
       {
           if(!b[i])
           return i;
       }
       return n+1;
         
   
    }
}
