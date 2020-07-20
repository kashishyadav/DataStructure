class GfG
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        int series[]={1,3,2,-1,-3,-2};
        int index=0;
        int res=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            int d=Character.getNumericValue(num.charAt(i));
            res+=(d*series[index]);
            index=(index+1)%6;
            res%=7;
        }
        if(res<0)
        res=(res+7)%7;
        
        return res;
    }
}
