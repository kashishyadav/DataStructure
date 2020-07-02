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
	     int n=Integer.parseInt(bf.readLine());
	     int arr[]=new int[n];
	     String str[]=bf.readLine().split(" ");
	     HashSet<Integer> hs=new HashSet<>();
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         hs.add(arr[i]);
	         
	     }
	     int count=longestCommmonSubsequnce(arr,n,hs);
	     System.out.println(count);
	 }
	 
	 
	 }
	 public static int longestCommmonSubsequnce(int arr[],int n,HashSet<Integer> hs)
	 {
	     int prev=0,curr=0;
	     for(int i=0;i<n;i++)
	     {
	         int num=arr[i];
	         //System.out.println("------------"+arr[i]);
	         curr=1;
	         if(!hs.contains(num-1))
	         {
	             for(int j=0;j<n;j++)
	         {
	             
	             num=num+1;
	             //System.out.print(num+" ");
	             if(hs.contains(num))
	              {
	                 // System.out.println("present "+curr);
	                  curr++;
	                  
	              }
	             else
	             break;
	         }
	         }
	         if(curr>=prev)
	         prev=curr;
	     }
	     return prev;
	 }
	 

 }
