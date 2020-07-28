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
	    String st[] =(bf.readLine()).split(" ");
	     int n=Integer.parseInt(st[0]);
	     int key=Integer.parseInt(st[1]);
	     int arr[]=new int[n];
	     String str[]=bf.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         
	     }
	    int first=firstoccurence(arr,n,key);
	    int last=lastoccurence(arr,n,key);
	    if(first==-1 && last==-1)
	    System.out.println("-1");
	    else
	     System.out.println(first+" "+last);
	 }
	 }
	 public static int firstoccurence(int arr[],int n,int key)
	 {
	     int low=0;
	     int high=n-1;
	     int result=-1;
	     while(low<=high)
	     {
	         int mid=(low+high)/2;
	         
	         if(arr[mid]==key)
	         {
	             high=mid-1;
	             result=mid;
	           //  System.out.println("arr[mid]1: "+arr[mid]);
	         }
	         else if(arr[mid]>key)
	         high = mid - 1; 
	         else
	         low=mid+1;
	     }
	     return result;
	 }
	 	 public static int lastoccurence(int arr[],int n,int key)
	 {
	     int low=0;
	     int high=n-1;
	     int result=-1;
	     while(low<=high)
	     {
	         int mid=(low+high)/2;
	         
	         if(arr[mid]==key)
	         {
	             low=mid+1;
	             result=mid;
	               //System.out.println("arr[mid]2: "+arr[mid]);
	         }
	         else if(arr[mid]>key)
	         high = mid - 1; 
	         else
	         low=mid+1;
	     }
	     return result;
	 }
}
