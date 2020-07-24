class MergeSort
{
    // Function to merge the two sorted arrays
    // arr1[], arr2[]: two input arrays
    // n, m: size of arr1[] and arr2[] respectively
    
  
    
    public static int nextGap(int gap)
    {
        if (gap <= 1) 
            return 0; 
        return gap/2 + gap%2;
    }
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        int i,j,gap=n+m;
        for(gap=nextGap(gap);gap>0;gap=nextGap(gap))
        {
            for(i=0;i+gap<n;i++)
            {
                if(arr1[i]>arr1[i+gap])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[i+gap];
                    arr1[i+gap]=temp;
                }
            }
            for(j=gap>n?gap-n:0;i<n && j<m ;i++,j++)
            {
                if(arr1[i]>arr2[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            if(j<m)
            {
                for(j=0;j+gap<m;j++)
                {
                    if(arr2[j]>arr2[j+gap])
                {
                    int temp=arr2[j];
                    arr2[j]=arr2[j+gap];
                    arr2[j+gap]=temp;
                }
                    
                }
            }
            
        }
    }
    public static void mergeUsingNormalApproach(int arr1[], int arr2[], int n, int m) 
    {
        
       // add your code here 
      for(int i=m-1;i>=0;i--)
      {
          int j;
          int val=arr1[n-1];
           
          for(j=n-1;j>0;j--)
          {
              if(arr2[i]<arr1[j])
              {
                  arr1[j]=arr1[j-1];
              }
              else{
                  break;
              }
          }
          if(j==0 && arr2[i]<arr1[0])
          {
              arr1[j+1]=arr1[0];
                if(j!=n-1)
              {
              arr1[j]=arr2[i];
              arr2[i]=val;
              }
          }
          else
          {
              if(j!=n-1)
          {
              arr1[j+1]=arr2[i];
              arr2[i]=val;
          }
           
          }
      }
    }
}
