class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int a=hm.size();
        list.add(a);
        for(int j=k;j<arr.length;j++)
        {
             if(hm.get(arr[j-k])==1)
             hm.remove(arr[j-k]);
             else
             hm.put(arr[j-k],hm.getOrDefault(arr[j-k],0)-1);
            
            hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
            int s=hm.size();
            list.add(s);
        }
        return list;
    }
     ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // count number of distinct elements for first window of size k
        for (int i = 0; i < k; i++)
        {
            if (hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i]) + 1);
            else
                hm.put(A[i], 1);
        }
        result.add(hm.size());

        // calculate answer for rest of the windows
        for (int i = k; i < n; i++)
        {
            // if frequency of last element of the window is greater than 1
            // then decrease the frequency
            if (hm.get(A[i - k]) > 1)
            {
                hm.put(A[i - k], hm.get(A[i - k]) - 1);
                // insert new element into the window
                if (hm.containsKey(A[i]))
                    hm.put(A[i], hm.get(A[i]) + 1);
                else
                    hm.put(A[i], 1);
            } 
            else
            {
                // remove last element from window
                hm.remove(A[i - k]);
                // insert new element into the window
                if (hm.containsKey(A[i]))
                    hm.put(A[i], hm.get(A[i]) + 1);
                else
                    hm.put(A[i], 1);
            }

            result.add(hm.size());
        }
        return result;
    }
}
