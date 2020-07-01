import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	 //code
	  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(bf.readLine());
	 while(t-->0)
	 {
	     
	     String str[]=bf.readLine().split(" ");
	     Long arr[]=new Long[str.length];
	     for(int i=0;i<str.length;i++)
	     {
	         arr[i]=Long.parseLong(str[i]);
	         
	     }
	     long result=arr[0];
	     long res=arr[0];
	     for(int i=1;i<arr.length;i++)
	       {
	           result=gcd(result,arr[i]);
	           res=lcm(res,arr[i]);
	       }
	       
	     System.out.println(res+" "+result);
	 }
	 
	 }
	 public static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    }
	 public static long gcd(long a,long b)
	 {
	     if(b==0)
	     return a;
	     
	     return gcd(b,a%b);
	 }
}
