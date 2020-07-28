class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        //  int temp[]=new int[l+r];
        int i,j,k;
         int n1=m-l+1;
         int n2=r-m;
         int left[]=new int[n1];
         int right[]=new int[n2];
         for(i=0;i<n1;i++)
         {
             left[i]=arr[l+i];
         }
         for(j=0;j<n2;j++)
         right[j]=arr[m+1+j];
         
         i=0;
         j=0;
         k=l;
         while(i<n1 && j<n2)
         {
             if(left[i]<=right[j])
             {
                 arr[k++]=left[i++];
                 
             }
             else
             {
                 arr[k++]=right[j++];
             }
         }
         while(i<n1)
         {
              arr[k++]=left[i++];
         }
         while(j<n2)
         {
             arr[k++]=right[j++];
         }
  
    

    }
}

 /* This method is present in a class other than GfG class .
static void mergeSort(int arr[], int l, int r)
 {
    GfG g = new GfG();
    if (l < r)   
   {
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr , m+1, r);
        g.merge(arr, l, m, r);
    }
}
