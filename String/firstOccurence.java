class GfG
{
    int strstr(String str, String target)
    {
       // Your code here
       int M=target.length();
       int N=str.length();
       for(int i=0;i<=N-M;i++)
       {
           int j;
           for(j=0;j<M;j++)
           {
               if(str.charAt(j+i)!=target.charAt(j))
                 break;
           }
           if(j==M)
           {
               return i;
           }
       }
       return -1;
    }
}
