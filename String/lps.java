class Solution {
    static int start=0;
    public String longestPalindrome(String s) {
        
        if(s.length()==0)
            return "";
        else if(s.length()==1)
            return s;
      int max=lps(s,s.length());
        if(max==0)
            return "";
        
         System.out.println("start: "+start+" end: "+max);
        if(start==0)
        {
            if(max+1==s.length())
            {
                StringBuilder sb=new StringBuilder();
                
                for(int i=start;i<s.length();i++)
                {
                    max--;
                    sb.append(s.charAt(i)+"");
                    if(max==0)
                        break;
                }
                return sb.toString();
            }
            else
            return s.substring(start,max);
        }
        else 
        {
            if(max+1==s.length())
            {
                StringBuilder sb=new StringBuilder();
                
                for(int i=start;i<=max;i++)
                {
                    sb.append(s.charAt(i)+"");
                }
                return sb.toString();
            }
            else
            { 
              StringBuilder sb=new StringBuilder();
                
                for(int i=start;i<s.length();i++)
                {
                    max--;
                    sb.append(s.charAt(i)+"");
                    if(max==0)
                        break;
                }
                return sb.toString();
               // return s.substring(start,max+1); 
            }
        } 
    }
    public static int lps(String str,int n)
    {
        if(str=="")
            return 0;
        boolean arr[][]=new boolean[n][n];
        int len=1;
        int len1=1;
        for(int i=0;i<n;i++)
        {
            arr[i][i]=true;
        }
        boolean flag=false;
        for(int i=n-2;i>=0;i--)
        {
            flag=false;
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                   
                    // System.out.println(str.charAt(i)+" "+str.charAt(j));
                    if(arr[i+1][j-1]||j-i==1)
                    {
                         flag=true;
                        arr[i][j]=true;
                        len=Math.max(len,j-i+1);
                        // System.out.println("len: "+len);
                    }
                }
            }
            if(len>=len1 && flag==true)
            {
                 System.out.println("updated: "+i+" len: "+len);
                 len1=len;
                // if(len1-i!=0)
                start=i;
            }
        }
        return len;
    }
}
