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
	     String str1[]=bf.readLine().split(" ");
	     int m=Integer.parseInt(str1[0]);
	     int n=Integer.parseInt(str1[1]);
	     int arr[][]=new int[m][n];
	     String str[]=bf.readLine().split(" ");
	     int k=0;
	     for(int i=0;i<m;i++)
	     {
	         for(int j=0;j<n;j++)
	          arr[i][j]=Integer.parseInt(str[k++]);
	         
	     }
	     spiralForm(arr,m,n);
	     System.out.println();
	 }
	 
	 }
	 public static void spiralForm(int arr[][],int m,int n)
	 {
	     int prev,curr;
	     int row=0,col=0;
	     int i;
	     while(row<m && col<n)
	     {
	         if(row+1==m || col+1==n)
	         break;
	         prev=arr[row+1][col];
	         for(i=col;i<n;i++)
	         {
	             curr=arr[row][i];
	             arr[row][i]=prev;
	             prev=curr;
	         }
	         row++;
	         for(i=row;i<m;i++)
	         {
	             curr=arr[i][n-1];
	             arr[i][n-1]=prev;
	             prev=curr;
	         }
	         n--;
	         
	         if(row<m)
	         {
	             for(i=n-1;i>=col;i--)
	         {
	             curr=arr[m-1][i];
	             arr[m-1][i]=prev;
	             prev=curr;
	         }
	         m--;
	         }
	         if(col<n)
	         {
	             for(i=m-1;i>=row;i--)
	         {
	             curr=arr[i][col];
	             arr[i][col]=prev;
	             prev=curr;
	         }
	         col++;
	             
	         }
	     }
	     for(int i=0;i<m;i++)
	     {
	         for(int j=0;j<n;j++)
	         {
	             System.out.print(arr[i][j]);
	         }
	     }
	 }
}
