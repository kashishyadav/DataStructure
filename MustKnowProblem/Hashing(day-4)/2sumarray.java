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
	     int n=Integer.parseInt(str1[0]);
	     int target=Integer.parseInt(str1[1]);
	     int arr[]=new int[n];
	     String str[]=bf.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         
	     }
	     if(twoSum(arr,target))
	  	     System.out.println("Yes");
	  	 else
	  	      System.out.println("No");
	 }
	 
	 }

    public static boolean twoSum(int[] arr, int target) {
         int index1=0,index2=0;
     
        int i=0,j=arr.length-1;
       
        int temp[]=new int[arr.length];
        for(int k=0;k<arr.length;k++)
        {
            temp[k]=arr[k];
        }
        Arrays.sort(arr);
        int sum=0;
        while(i<j)
        {
            sum=(arr[i]+arr[j]);
            if(sum==target)
            {
               // System.out.println("sum "+sum);
                index1=i;
                index2=j;
                break;
            }
            if(sum>target)
            {
                
                j--;
                continue;
             }
               i++;
        }
        int c1=0,c2=0;
        for( i=0;i<arr.length;i++)
        {
            if(arr[index1]==temp[i] && c1==0)
            {
                index1=i;
                c1++;
            }
            else if(arr[index2]==temp[i] && c2==0)
            {
                index2=i;
                c2++;
            } 
            if(c1==1 && c2==1 && (temp[index1]+temp[index2])==target)
               {
                  // System.out.println(temp[index1]+"  "+temp[index2]);
                   return true;
               }
        }
        
         return false;
    }
}
