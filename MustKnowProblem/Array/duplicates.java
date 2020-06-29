class Solution {
    
    //by counting frequency for the element
    
      public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
             max=arr[i];
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            if(freq[i]>1)
             list.add(i);
        }
        if(list.size()>0)
        return list;
        else
        {
            list.add(-1);
            return list;
        }    
        
    }
    //by using treeset to maintain sorting of element and hashset to check for duplicacy
    
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        TreeSet<Integer> l=new TreeSet<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else{
                
                l.add(arr[i]);
            }
        }
        if(l.size()>0)
        {
            for(int k:l)
            list.add(k);
            
            return list;
        }
        else{
            list.add(-1);
            return list;
        }
    }
    //use adding method according to arrayValue as if num is repeated so its correspond index add more time ....
     public static ArrayList<Integer> duplicates(int arr[], int n) {
        // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                ans.add(i);
                flag = 1;
            }
        }
        if (flag == 0) ans.add(-1);
        return ans;
    }
}
