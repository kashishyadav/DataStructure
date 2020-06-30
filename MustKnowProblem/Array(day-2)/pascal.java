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
	     int row=Integer.parseInt(bf.readLine());
	     
	     pascalTriangle(row);
	     System.out.println();
	 }
	 
	 }
	 public static void pascalTriangle(int row)
	 {
	     for(int i=1;i<=row;i++)
	     {
	         int c=1;
	     for(int j=1;j<=i;j++)
	     {
	         
	         System.out.print(c+" ");
	         c=c*(i-j)/j;
	     }
	      System.out.println();
	     }
	 }
	 public static void pascalTriangle1(int n)
	 {
	     int arr[][]=new int[n][n];
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<=i;j++)
	         {
	             if(j==i || j==0)
	             {
	                 arr[i][j]=1;
	             }
	             else
	             {
	                 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
	             }
	             
	             System.out.print(arr[i][j]+" ");
	         }
	          System.out.println();
	     }
	     
	 }
}
