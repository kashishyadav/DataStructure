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
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         
	     }
	    int first=firstoccurence(arr,n);
	    if(first==-1)
	    System.out.println("-1");
	    else
	    System.out.println(first);
	 }
	 }
	 public static int firstoccurence(int arr[],int n)
	 {
	     int low=0;
	     int high=n-1;
	     int result=-1;
	     while(low<=high)
	     {
	         int mid=(low+high)/2;
	         
	         if(arr[mid]==1 &&(mid==0 || arr[mid-1]==0))
	         {
	            
	             return mid;
	            
	           //  System.out.println("arr[mid]1: "+arr[mid]);
	         }
	         else if(arr[mid]==1)
	         high = mid - 1; 
	         else
	         low=mid+1;
	     }
	     return result;
	 }
	
}
