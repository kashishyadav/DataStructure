public static int findMedian(int arr[], int n, int brr[], int m){
    //Your code here
    int len=n+m;
    int arrnew[]=new int[len];
    for(int i=0;i<n;i++)
    {
        arrnew[i]=arr[i];
    }
    int j=0;
    for(int i=n;i<len && j<m;i++)
    {
         arrnew[i]=brr[j++];
    }
    Arrays.sort(arrnew);
    int med=(n+m)/2;
    if((n+m)%2==0)
    {
        if(med+1 <len)
        {
            int tot=(arrnew[med-1]+arrnew[med])/2;
            // System.out.print("toy "+tot+" arr[mid]: "+arrnew[med]+" ar[mid+1]: "+arrnew[med+1]);
            return tot;
        }
        else
        {
            return arrnew[med];
        }
    }
    else
    {
        return arrnew[med];
    }
}
