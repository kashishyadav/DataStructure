class Solution
{
    // Function to return Largest Number
    static String largestNumber(int n, int sum)
    {
    int total=0;
    ArrayList<Integer> al=new ArrayList<>();
    //System.out.print("sum: "+sum);
    if(sum<10)
    {
        // System.out.print("sum: less than 9 "+sum);
        al.add(sum);
        sum=0;
        for(int i=0;i<n-1;i++)
        {
            al.add(0);
        }
        
    }
    else
    {
        al.add(9);
        sum=sum-9;
      for(int i=0;i<n-1;i++)
       {
           if(sum==0 && i!=(n-1))
           {
               
               for(int j=i+1;j<n-1;j++)
             {
                 al.add(0);
             }
             break;
           }
         
         if(sum<10)
         {
             al.add(sum);
             sum=0;
             for(int j=i+1;j<n-1;j++)
             {
                 al.add(0);
             }
             break;
         }
         int a=minus(sum);
         if(a>0)
         {
             al.add(a);
             sum=sum-a;
         }
         
       }
    }
    String s="";
     for(int i=0;i<n;i++)
        {
           s=s+al.get(i);
        }
       // System.out.println("sum : "+sum);
        // if(s.length()==0)
        // return "-1";
        
        if(sum!=0)
         return "-1";
         
        return s;
}
public static int minus(int sum)
{
    if(sum-9>=0)
    return 9;
    else if(sum-8>=0)
    return 8;
    else if(sum-7>=0)
    return 7;
    else if(sum-6>=0)
    return 6;
    else if(sum-5>=0)
    return 5;
    else if(sum-4>=0)
    return 4;
    else if(sum-3>=0)
    return 3;
    else if(sum-2>=0)
    return 2;
    else if(sum-1>=0)
    return 1;
    else
    return 0;
}
}
