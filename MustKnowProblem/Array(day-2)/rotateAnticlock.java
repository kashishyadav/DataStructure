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
	     int arr[][]=new int[n][n];
	     String str[]=bf.readLine().split(" ");
	     int k=0;
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<n;j++)
	          arr[i][j]=Integer.parseInt(str[k++]);
	         
	     }
	     rotateAnticlock(arr,n);
	     //rotateMatrix(n,arr);
	     System.out.println();
	 }
	 
	 }
	 
	 public static void rotateAnticlock(int arr[][],int n)
	 {
	    for(int i=0;i<n/2;i++)
	    {
	        for(int j=i;j<n-i-1;j++)
	        {
	            int temp=arr[i][j];
	            arr[i][j]=arr[j][n-1-i];
	            arr[j][n-1-i]=arr[n-1-i][n-1-j];
	            arr[n-1-i][n-1-j]=arr[n-1-j][i];
	            arr[n-1-j][i]=temp;
	        }
	    }
	   
	     for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<n;j++)
	             System.out.print(arr[i][j]+" ");
	         }
	 }

	         
    
}
