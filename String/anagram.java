class Anagram{    
    /*  Function to check if two strings are anagram
    *   c, d: input string
    */
    public static boolean isAnagram(String s1,String s2)
    {
        
        // Your code here
        if(s1.length()!=s2.length())
        return false;
        
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        
        for(int i=0;i<s1.length();i++)
        {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            return false;
        }
        return true;
    }
}
