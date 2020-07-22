class Solution {
    public Set<String> set;
    public boolean isValidIP(String s) {
        set=new HashSet<>();
        for(int i=0;i<256;i++)
        {
            set.add(String.valueOf(i));
        }
        int dots=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            dots++;
            
        }
        if(dots!=3)
         return false;
         
         String str[]=s.split("[.]",0);
         if(str.length!=4)
         return false;
         for(String x:str)
         {
             if(!set.contains(x))
             return false;
         }
         return true;
    
    
    }
}
