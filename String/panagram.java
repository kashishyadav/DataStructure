class MissingPanagram
{
    
      
    public static String missingPanagram(String str)
    {
        // Find and return the missing characters
        // to complete Panagram string

        
        String s=new String();
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
             arr[str.charAt(i)-'a']++; 
          else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
            arr[str.charAt(i)-'A']++;
            
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
             s=s+(char)(i+'a');
        }
        return s.length()>0?s:"-1";
    }
}
