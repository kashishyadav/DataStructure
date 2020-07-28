class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
	   if(x==1||x==0)
	   return x;
	   long ans=0,low=1,high=x;
	   while(low<=high)
	   {
	       long mid=(low+high)/2;
	       if(mid*mid==x)
	       {
	           return mid;
	       }
	       else if(mid*mid<x)
	       {
	           low=mid+1;
	           ans=mid;
	       }
	       else
	       high=mid-1;
	   }
	   return ans;
	 }
}
