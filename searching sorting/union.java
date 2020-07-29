
class Union
{
   public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        java.util.TreeSet<Integer> s=new java.util.TreeSet<>();
        
        for(int i=0;i<n;i++)
        s.add(arr1[i]);
        
         for(int i=0;i<m;i++)
        s.add(arr2[i]);
        
        ArrayList<Integer> list=new ArrayList<>();
        
       Iterator it=s.iterator();
       while(it.hasNext()){
            int a=(int)it.next();
            list.add(a);
        }
        
        return list;
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0, j = 0; 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (i < n && j < m) 
        { 
            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
                i++;
                // avoiding identical elements in arr1
            
            while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
                j++;
                // avoiding identical elements in arr2
          
            if (arr1[i] < arr2[j]) 
                ans.add(arr1[i++]);
                //cout << arr1[i++] << " ";
                // printing the smaller number
                // to mantain ascending order
          
            else if (arr2[j] < arr1[i]) 
                ans.add(arr2[j++]);
                //cout << arr2[j++] << " ";
          
            else
            {
                ans.add(arr2[j++]);
                //cout << arr2[j++] << " "; 
                i++;
                // if arr1[i] is same as arr2[j], number is
                // printed once and i and j are incremented
            }
        } 
        // loop breaks when either i or j reach end of
        // arr1 or arr2 respectively
        
        while(i < n)
        // printing elements of arr1 (if any left)
        {
            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
                i++;
                // avoiding repetition
            ans.add(arr1[i++]);
            //cout << arr1[i++] << " "; 
        }
      
        while(j < m)
        // printing elements of arr2 (if any left)
        {
            while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
                j++;
                // avoiding repetition
            ans.add(arr2[j++]);
            //cout << arr2[j++] << " "; 
        }
        return ans;   
        }
}
