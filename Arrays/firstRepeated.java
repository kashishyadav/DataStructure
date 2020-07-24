public static int firstRepeated(int []arr, int n) 
{
    //Your code here
    if(arr.length==1)
    return -1;
   HashMap<Integer,Integer> hm=new HashMap<>();
   for(int i=0;i<arr.length;i++)
   {
       if(!hm.containsKey(arr[i]))
       {
           hm.put(arr[i],1);
       }
       else{
            hm.put(arr[i],(hm.get(arr[i]))+1);
       }
   }
   if(hm.size()>0)
  {
      for(int i=0;i<hm.size();i++)
   {
       if(hm.get(arr[i])>1)
       return i+1;
   }
  }
   return -1;
//   java.util.Map.Entry<Integer,Integer> e=hm.entrySet();
//   int index=0;
//   for(java.util.Map.Entry<Integer,Integer> v:e)
//   {
//       if(v.getValue()>1)
//       {
//           break;
//       }
//       index++;
//   }
//   return index;
}
