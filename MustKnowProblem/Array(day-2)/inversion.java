import java.lang.*;
import java.io.*; 
import java.util.*;
class GFG {
	public static void main (String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
		    	int n=Integer.parseInt(br.readLine());
		    	int arr[]=new int[n];
		    	String h=br.readLine();
		    	String str[]=h.split(" ");
		    	for(int i=0;i<str.length;i++)
		    	{
		    	    arr[i]=Integer.parseInt(str[i]);
		    	}
		    //	long count=0;
		         
		    	System.out.println(countMerge(arr,0,arr.length-1));
		    --t;
		}
	}
	public static long  countMerge(int []arr,int low,int high)
	{
	    long count=0;
	    
	    if(low<high)
	    {
	        int mid=(low+high)/2;
	        count+=countMerge(arr,low,mid);
	        count+=countMerge(arr,mid+1,high);
	        count +=mergeSort(arr,low,mid,high);
	        
	    }
	    return count;
	}
	public static long mergeSort(int arr[],int l,int m,int r)
	{
	    int n1=m-l+1;
	    int n2=r-m;
	    int L[]=new int[n1];
	    int R[]=new int[n2];
	    long swaps=0;
	    for(int i=0;i<n1;i++)
	    {
	        L[i]=arr[l+i];
	    }
	    for(int j=0;j<n2;j++)
	    {
	        R[j]=arr[m+j+1];
	        
	    }
	   int i=0,j=0,k=l;
	   while(i<n1 && j<n2)
	   {
	       if(L[i]<=R[j])
	       {
	           arr[k++]=L[i++];
	       }
	       else
	       {
	           arr[k++]=R[j++];
	           swaps+=(m+1)-(i+l);
	       }
	   }
	   while(i<n1)
	   arr[k++]=L[i++];
	   
	   while(j<n2)
	   arr[k++]=R[j++];
	   
	   
	   return swaps;
	    
	}
}
