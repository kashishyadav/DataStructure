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
	    // int m=Integer.parseInt(bf.readLine());
	     String str3[]=bf.readLine().split(" ");
	     
	     String str[]=bf.readLine().split(" ");
	     
	     int arr1[]=new int[str.length];
	    
	     for(int i=0;i<str.length;i++)
	     arr1[i]=Integer.parseInt(str[i]);
	     
	     String str1[]=bf.readLine().split(" ");
	      int arr2[]=new int[str1.length];
	      
	     for(int i=0;i<str1.length;i++)
	     arr2[i]=Integer.parseInt(str1[i]);
	     
	     
	     merge(arr1,arr2);
	     
	 
	     
	     System.out.println();
	 }
	 }
	 public static void merge(int arr1[],int arr2[])
	 {
	    int last=0;
	    int m=arr1.length;
	    int n=arr2.length;
	    //Syste
	     for(int i=n-1;i>=0;i--)
	     {
	         last=arr1[m-1];
	         int j;
	         for(j=m-2;j>=0 && arr1[j]>arr2[i];j--)
	         {
	             arr1[j+1]=arr1[j];
	         }
	     
	     if(j!=m-2 || arr2[i]<last)
	     {
	         arr1[j+1]=arr2[i];
	         arr2[i]=last;
	     }
	     }
	   
        
	     for(int i=0;i<arr1.length;i++)
	     System.out.print(arr1[i]+" ");
	     
	      for(int i=0;i<arr2.length;i++)
	     System.out.print(arr2[i]+" ");
	 }
	 
}
