import java.util.*;
import java.lang.*;
import java.io.*;
class Stock{
    int buy;
    int sell;
    Stock()
    {
        
    }
    Stock(int buy,int sell)
    {
        this.buy=buy;
        this.sell=sell;
    }
}
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
	     stockNbuy(arr,n);
	     System.out.println();
	 }
	 
	 }
	 public static void stockNbuy(int arr[],int n)
	 {
	     if(n==1)
	      return;
	     if(n==2)
	     {
	         if(arr[0]>arr[1])
	         {
	             System.out.print("No Profit");
	         }
	         else
	         {
	             System.out.print(arr[0]+" "+arr[1]);
	         }
	         return;
	     }
	     ArrayList<Stock> list=new ArrayList<>();
	     int i=0;
	     while(i<n-1)
	     {
	         while(i<n-1 && arr[i+1]<=arr[i])//find minimum element so that we can buy 
	         i++;
	         if(i==n-1)//if minimum is last that means no chnace of profit break it
	         break;
	         Stock s=new Stock();
	         s.buy=i;
	         i++;
	         while(i<n && arr[i]>arr[i-1])//find maximum element so we can sell
	         i++;
	         s.sell=i-1;
	         list.add(s);
	     }
	     if(list.size()==0)
	        System.out.print("No Profit");
	   else{
	       for(i=0;i<list.size();i++)
	       {
	              System.out.print("("+list.get(i).buy+" "+list.get(i).sell+")"+" ");
	       }
	   }
	     
	 }
	 
}
