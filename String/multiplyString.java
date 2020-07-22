class Sol
{
    public String multiply(String str1,String str2)
    {
        //code here.
        StringBuilder sb=new StringBuilder();
        if ((str1.charAt(0) == '-' || str2.charAt(0) == '-') &&  
        (str1.charAt(0) != '-' || str2.charAt(0) != '-')) 
        sb.append("-");
  
    if (str1.charAt(0) == '-' &&  
        str2.charAt(0) != '-')  
    { 
        str1 = str1.substring(1); 
    }  
    else if (str1.charAt(0) != '-' &&  
             str2.charAt(0) == '-') 
    { 
        str2 = str2.substring(1); 
    }  
    else if (str1.charAt(0) == '-' &&  
             str2.charAt(0) == '-') 
    { 
        str1 = str1.substring(1); 
        str2 = str2.substring(1); 
    } 
      if(str1.equals("0") || str2.equals("0"))
      return "0";
      
        String s=multiply1(str1, str2);
       return sb.append(""+s).toString();
        
    }
    static String multiply1(String a, String b) 
{ 
     if(a.length()==0 && b.length()==0)
        return "0";
        
        int len1=a.length();
        int len2=b.length();
        
        int i1=0,i2=0;
        int carry=0;
        
        int res[]=new int[len1+len2];
        
        for(int i=len1-1;i>=0;i--)
        {
            carry=0;
            int n1=a.charAt(i)-'0';
            i2=0;
            for(int j=len2-1;j>=0;j--)
            {
                int n2=b.charAt(j)-'0';
                int sum=n1*n2+res[i1+i2]+carry;
                carry=sum/10;
                res[i1+i2]=sum%10;
                i2++;
            }
            if(carry>0)
            res[i1+i2]+=carry;
            
            i1++;
        }
        int ik=res.length-1;
        while(ik>=0 && res[ik]==0)
        ik--;
        
        if(ik==-1)//all zero 
        return "0";
        
        String result="";
        while(ik>=0)
        {
            result+=res[ik--];
        }
        return result;      
} 
}
