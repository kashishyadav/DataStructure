/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	 public static void main(String[] args)  
    { 
        int arr[] = { 4, 2, 2, 6, 4 }; 
        int n = arr.length; 
        int m = 6; 
  
        System.out.print("Number of subarrays having given XOR is "
        + subArray(arr, n, m)); 
    } 
	public static int subArray(int arr[],int n,int m)
	{
	    int xor[]=new int [n];
	    xor[0]=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        xor[i]=xor[i-1]+arr[i];//calculate prefix sum
	    }
	    HashMap<Integer,Integer> hm=new HashMap<>();
	   // int sum=0;
	    int count=0;
	 
           
	    for(int i=0;i<n;i++)
	    {
	       int sum=xor[i]^m;
	    
	        count=count+(hm.containsKey(sum)==false?0:((int)hm.get(sum)));
	        //if already present so count how many time it is present..
	        
	        if(xor[i]==m)//if m is direct equal to any index value that mean xor present..
	        count++;
	        
	        if(hm.containsKey(xor[i]))
	        {
	            hm.put(xor[i],hm.get(xor[i])+1);
	        }
	        else
	        {
	            hm.put(xor[i],1);
	        }
	    }
	    return count;
	}
}
