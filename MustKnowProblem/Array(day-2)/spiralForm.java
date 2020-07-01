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
	     int i,k=0,l=0;
	     int last_row=m-1;
	     int last_col=n-1;
	     
	     while(k<=last_row && l<=last_col)
	     {
	         for(i=l;i<=last_col;i++)
	         {
	             System.out.print(arr[k][i]+" ");
	         }
	         k++;
	         for(i=k;i<=last_row;i++)
	         {
	             System.out.print(arr[i][last_col]+" ");
	         }
	         last_col--;
	         if(k<=last_row)
	         {
	             for(i=last_col;i>=l;i--)
	          {
	             System.out.print(arr[last_row][i]+" ");
	         }
	         last_row--;
	         }
	          if(l<=last_col)
	         {
	             for(i=last_row;i>=k;i--)
	          {
	             System.out.print(arr[i][l]+" ");
	         }
	         l++;
	         }
	     }
	 }
}
