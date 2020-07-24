class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        int diff=Integer.MAX_VALUE;
        int immediate=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                break;
            }
            if(arr[i]<x && x-arr[i]<diff)
            {
                diff=x-arr[i];
                immediate=arr[i];
                
            }
        }
        return immediate;
    }
}
