class InsertionSort
{
  static void insert(int arr[],int n)
  {
       // Your code here
       for(int i=1;i<=n;i++)
       {
           int j=i-1;
           int key=arr[i];
           while(j>=0 && arr[j]>key)
           {
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
       }
  }
}
