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
	     kadane(arr,n);
	     System.out.println();
	 }
	 
	 }
	

	 public static void kadane(int arr[], int n) {
        // code here
        int max1=arr[0],max2=arr[0];
        for(int i=1;i<n;i++)
        {
            max1=Math.max(arr[i],max1+arr[i]);
            max2=Math.max(max1,max2);
        }
       
        System.out.print(max2);
        
    }
}
