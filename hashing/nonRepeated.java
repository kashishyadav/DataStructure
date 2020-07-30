class Hashing
{
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hs.containsKey(arr[i]))
            {
                hs.put(arr[i],1);
                
            }
            else
            {
                hs.put(arr[i],(hs.get(arr[i])+1));
            }
        }
        Set<Map.Entry<Integer,Integer>> s=hs.entrySet();
        for(Map.Entry<Integer,Integer> e :s)
        {
            if(e.getValue()==1)
             list.add(e.getKey());
        }
        return list;
    }
}
