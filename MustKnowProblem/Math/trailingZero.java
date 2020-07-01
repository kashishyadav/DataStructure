import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
 public static int trailingZero(int n)
	 {
	     int count=0;
	     while(n>0)
	     {
	         count+=n/5;
	         n=n/5;
	     }
	       
	       return count;
	 }
   {
   n=9;
   condition(n>0)
   9/5=1
   1/5=0 (on adding)
       1
       
    }
       
	public static void main (String[] args)throws IOException
	 {
	 //code
	  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(bf.readLine());
	 while(t-->0)
	 {
	     int n=Integer.parseInt(bf.readLine());
	     
	     System.out.println(trailingZero(n));
	 }
	 
	 }
	 public static int trailingZero(int n)
	 {
	     int count=0;
	     for(int i=5;n/i>=1;i*=5)
	       count+=(n/i);
	       
	       return count;
	 }
	 
}
