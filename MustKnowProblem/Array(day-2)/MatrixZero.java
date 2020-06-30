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
	       String str[]=bf.readLine().split(" ");
	       int r=Integer.parseInt(str[0]);
	       int c=Integer.parseInt(str[1]);
	       int arr[][]=new int[r][c];
	     for(int i=0;i<r;i++)
	     {
	         String str1[]=bf.readLine().split(" ");
	         
	         for(int j=0;j<str1.length;j++)
	         arr[i][j]=Integer.parseInt(str1[j]);
	         
	     }
	     replaceZero(arr,r,c);
	     //System.out.println();
	 }
	 
	 }
	 public static void replaceZero(int arr[][],int r,int c)
	 {
	   //  System.out.println(r+" "+c);;
	     int row[]=new int[r];
	     int col[]=new int[c];
	     
	     for(int i=0;i<r;i++)
	     row[i]=0;
	     
	     for(int i=0;i<c;i++)
	     col[i]=0;
	     
	     for(int i=0;i<r;i++)
	     {
	         for(int j=0;j<c;j++)
	           {
	               if(arr[i][j]==1)
	               {
	                   row[i]=1;
	                   col[j]=1;
	               }
	               
	           }
	     }
	      for(int i=0;i<r;i++)
	     {
	         for(int j=0;j<c;j++)
	           {
	               if(row[i]==1 || col[j]==1)
	               {
	                   arr[i][j]=0;
	               }
	               
	           }
	     }
	     
	     
	     printArray(arr,r,c);
	     
	 }
	 public static void printArray(int arr[][],int r,int c)
	 {
	     StringBuilder sb=new StringBuilder();
	        for(int i=0;i<r;i++)
	       {
	         for(int j=0;j<c;j++)
	           {
	               sb.append(arr[i][j]+" ");
	               
	           }
	           sb.append("\n");
	       }
	       System.out.print(sb);
	     
	 }
}
