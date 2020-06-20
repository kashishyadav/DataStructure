class Platform
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j=0;
        int i=1;
        int pf=1;
        int res=1;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                i++;
                pf++;
                if(pf>res)
                res=pf;
            }
            else
            {
                pf--;
                j++;
            }
            
        }
        return res;

        
    }
    
}
