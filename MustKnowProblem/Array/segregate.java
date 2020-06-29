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
	     segregate(arr,n);
	     System.out.println();
	 }
	 
	 }
	 public static void segregate(int arr[],int n)
	 {
	    int high=n-1;
	    int low=0;
	    int mid=0;
	    while(mid<=high)
	    {
	        switch(arr[mid])
	        {
	            case 0:
	                int temp1=arr[low];
	                arr[low]=arr[mid];
	                arr[mid]=temp1;
	                mid++;
	                low++;
	                break;
	           case 1:
	               mid++;
	               break;
	           case 2:
	               int temp2=arr[high];
	                arr[high]=arr[mid];
	                arr[mid]=temp2;
	               high--;
	               break;
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	 }
}
