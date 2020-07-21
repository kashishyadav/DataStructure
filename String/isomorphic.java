class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        if(s1.length()!=s2.length())
        return false;
        
       java.util.HashMap<Character,Character> hm=new java.util.HashMap<>();
       
       for(int i=0;i<s1.length();i++)
       {
           char ch1=s1.charAt(i);
           char ch2=s2.charAt(i);
           
           if(hm.containsKey(ch1))
           {
               if(hm.get(ch1)!=ch2)
               return false;
           }
           else
           {
               if(hm.containsValue(ch2))
               return false;
               
               hm.put(ch1,ch2);
           }
       }
       return true;
        
    }
}
