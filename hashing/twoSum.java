class Solution
{
    public boolean keypair(int[] a, int n, int x)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; ++i)
        {
            int temp = x - a[i];

            // checking for condition
            if (s.contains(temp)) 
                return true;
            
            s.add(a[i]);
        }
        return false;
    }
     public boolean keypair(int[] arr, int N, int X)
    {
        // code here
        Arrays.sort(arr);
        int low=0;
        int high=N-1;
        while(low<high)
        {
            int ans=arr[low]+arr[high];
            if(ans==X)
            return true;
            else if(ans>X)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return false;
        // ArrayList<Integer> hs=new ArrayList<Integer>();
        // for(int i=0;i<N;i++)
        //  {
        //      hs.add(arr[i]);
        //  }
        // for(int i=0;i<N;i++)
        // {
        //     int res=(X>arr[i])?(X-arr[i]):arr[i]-X;
        //     // /System.out.print
        //     if(hs.contains(res))
        //       {
        //         //  System.out.println("res: "+res+" val:"+X+" arr[i]: "+arr[i]);
        //         if((res+arr[i])==X && (( i<N-1 && res==arr[i] && res==arr[i+1] )||res!=arr[i] ))
        //           return true;
        //       }
        // }
        // return false;
    }
}
