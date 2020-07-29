class Intersection
{
    /* Function prints Intersection of arr1[] and arr2[] 
    n is the number of elements in arr1[] 
    m is the number of elements in arr2[] 
    Return the array
    */
    static ArrayList<Integer> printIntersection1(int arr1[], int arr2[], int n, int m) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        TreeSet<Integer> s=new TreeSet<>();
        LinkedHashSet<Integer>l=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        s.add(arr1[i]);
        
        for(int j=0;j<m;j++)
        {
            if(s.contains(arr2[j]) )
            {
                l.add(arr2[j]);
            }
            else
            s.add(arr2[j]);
        }
        Iterator it=l.iterator();
        while(it.hasNext())
        {
            int a=(int)it.next();
            list.add(a);
        }
        if(list.size()>0)
          {
              return  list;
          }
         else
         {
             list.add(-1);
             return list;
         }
        
    }
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        // add your code here
        int i=0,j=0;
        boolean flag=false;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m )
        {
            if(i>0 && arr1[i-1]==arr1[i])
            {
                i++;
                continue;
            }
            
            if(arr1[i]>arr2[j])
            {
                j++;
               
            }
            else if(i<n && j<m && arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                list.add(arr1[i]);
                i++;
                j++;
                flag=true;
            }
        }
       if(flag==true)
          {
              return  list;
          }
         else
         {
             list.add(-1);
             return list;
         }
    }

}
