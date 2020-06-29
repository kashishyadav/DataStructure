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
	     int arr[]=new int[n];
	     String str[]=bf.readLine().split(" ");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=Integer.parseInt(str[i]);
	         
	     }
	     duplicates(arr,n);
	     System.out.println();
	 }
	 
	 }
	
	 public static void missingRepeat(int arr[],int n)
	 {
	     int x=0,y=0;
	     int xor;
	     xor=arr[0];
	     
	     for(int i=1;i<n;i++)
	     {
	         xor^=arr[i];
	     }
	      for(int i=1;i<=n;i++)
	     {
	         xor^=i;
	     }
	     int set_bit=(xor)&(~(xor-1));
	     for(int i=0;i<n;i++)
	     {
	         if((set_bit&arr[i])!=0)
	         x=x^arr[i];
	         else
	         y=y^arr[i];
	     }
	     for(int i=1;i<=n;i++)
	     {
	         if((set_bit&i)!=0)
	         x=x^i;//missing
	         else
	         y=y^i;//repeat
	     }
	     System.out.print(y+" "+x);
	 }
	 public static void duplicates(int arr[], int n) {
        // code here
        int temp[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            
            if(temp[arr[i]]==0)
            temp[arr[i]]=1;
            else if(temp[arr[i]]==1)
            {
                System.out.print(arr[i]);
            }
            
        }
        for(int i=0;i<=n;i++)
        {
            
            if(temp[i]==0 && i!=0)
            {
                System.out.print(" "+i);
            }
            
        }
        
    }
}
