
public static boolean check(long arr[],long brr[],int n)
{
    //Your code here
    if(arr.length!=brr.length)
    return false; 
    
    java.util.HashMap<Long,Integer>hm=new java.util.HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        hm.put(arr[i],i);
    }
    int count=0;
    for(int i=0;i<brr.length;i++)
    {
        if(hm.containsKey(brr[i]))
        {
            count++;
        }
    }
    if(count==brr.length)
    return true;
    else
    return false;
}
public static boolean check(long arr[],long brr[],int n)
{
    HashMap<Long, Long> hm = new HashMap<Long, Long>();
    for(int i = 0;  i< n; i++)
        {
            long num = arr[i];
            if(hm.containsKey(num))
            {
                long freq = hm.get(num);
                freq++;
                hm.put(num, freq);
            }
            else{
                hm.put(num, (long)1);
            }
        }
    
        
        // iterating through the elements and decrement the frequency this time
        for(int i = 0; i < n; i++)
        {
            long num = brr[i];
            if(hm.containsKey(num))
            {
                long freq = hm.get(num);
                freq--;
                hm.put(num, freq);
            }
        }
         
        boolean flag = false;
        
        // print 0, if the map doesn't has 0 in it for any value
        for(Map.Entry<Long, Long> entry: hm.entrySet())
        {
            if(entry.getValue() != 0)
            {
                flag = true;
                return false;
                
            }
        }
        
        
        return true;
}
