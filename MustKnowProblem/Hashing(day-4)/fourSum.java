import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	//using hashing
  static class pair
  {
      int index1;
      int index2;
      int index3;
      int index4;
      pair(int i,int j)
      {
          index1=i;
          index2=j;
      }
     
  }
  public static StringBuilder fourSum(int []arr,int target)
   {
       StringBuilder sb=new StringBuilder();
       int n=arr.length;
       HashMap<Integer,pair>hm =new HashMap<>();
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               int sum=arr[i]+arr[j];
               hm.put(sum,new pair(i,j));
           }
       }
      
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               int sum=arr[i]+arr[j];
               if(hm.containsKey(target-sum))
               {
                   pair p=hm.get(target-sum);
                   if(p.index1!=i && p.index1!=j && p.index2!=i && p.index2!=j)
                   {
                      
                       sb.append(arr[p.index1]+" "+arr[p.index2]+" "+arr[i]+" "+arr[j]+"$");
                       
                       //return sb;
                   }
               }
           }
       }
       return sb;
   }
	public static void main (String[] args)throws IOException
	 {
	 //code
	  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(bf.readLine());
	 while(t-->0)
	 {
	     String str1[]=bf.readLine().split(" ");
	     int n=Integer.parseInt(str1[0]);
	     int target=Integer.parseInt(str1[1]);
	     int arr[]=new int[n];
	     String str[]=bf.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         
	     }
	  	     System.out.println(fourSum(arr,target));
	  	 
	 }
	 
	 }

 }
