class solve{
    
    void printJobScheduling(Job arr[], int n){
        // Your code here
        Arrays.sort(arr,new Comparator<Job>(){
            @Override
            public int compare(Job j1,Job j2)
            {
                return j2.profit-j1.profit;
            }
            });
            
       int result[]=new int[n];
       boolean place[]=new boolean[n];
       for(int i=0;i<n;i++)
       {
           place[i]=false;
       }
       for(int i=0;i<n;i++)
       {
           for(int j=Math.min(n,arr[i].deadline)-1;j>=0;j--)
           {
               if(place[j]==false)
               {
                   place[j]=true;
                   result[j]=i;
                   break;
               }
           }
       }
       int count=0,total=0;
       for(int i=0;i<n;i++)
       {
           if(place[i]==true)
           {
              count++;
              total+=arr[result[i]].profit;
           }
       }
       System.out.print(count+" "+total);
    }
    
}
