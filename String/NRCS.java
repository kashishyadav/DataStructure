class Solution
{
    //o(n^2)

    int SubsequenceLength(String s) 
    {
        // Code here    
        Set<Character> set;
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            set=new HashSet<>();
            for(int j=i;j<s.length();j++)
            {
                if(!set.contains(s.charAt(j)))
                set.add(s.charAt(j));
                else
                break;
            }
            if(set.size()>=len)
            len=set.size();
        }
        return len;
    }
    //o(2n) just remove every time the first letter added in set
     int SubsequenceLength(String s) 
    {
        // Code here    
        Set<Character> set=new HashSet<>();
        int len=0,j=0,i=0;
        int n=s.length();
      while(i<n && j<n)
             {
                if(!set.contains(s.charAt(j)))
                 {
                     set.add(s.charAt(j++));
                     len=Math.max(len,j-i);
                 }
                else
                set.remove(s.charAt(i++));
            }
            
      return len;
    }
    //o(n)
    //do not repeat step like abee so above approach repeat upto first e instead direct assign 
    //index 4(second e) so time complexity reduces;
      int SubsequenceLength(String s) 
    {
        // Code here    
        java.util.HashMap<Character,Integer> hm=new java.util.HashMap<>();
        int len=0;
        int n=s.length();
         for(int j=0,i=0;j<n;j++)
         {
                if(hm.containsKey(s.charAt(j)))
                 {
                     i=Math.max(hm.get(s.charAt(j)),i);
                 }
                len=Math.max(len,j-i+1);
                hm.put(s.charAt(j),j+1);
                
            }
            
       return len;
    }
}
