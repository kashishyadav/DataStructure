import java.util.*;
import java.lang.*;
import java.io.*;
class Interval implements Comparable<Interval>
{
    int start,end;
    Interval(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    @Override
     public int compareTo(Interval i1)
    {
        return this.start-i1.start;
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
	     Interval arr[]=new Interval[n];
	     String str[]=bf.readLine().split(" ");
	     int j=0;
	     for(int i=0;i<n;i++)
	     {
	         if(j<str.length)
	         {
	             arr[i]=new Interval(Integer.parseInt(str[j++]),Integer.parseInt(str[j++]));
	             
	         }
	         
	     }
	     Arrays.sort(arr);
	      overlapInterval(arr,n);
	      System.out.println();
	    
	 }
	 
	 }
	 public static void overlapInterval(Interval arr[],int n)
	 {
	     Stack<Interval> s=new Stack<>();
	     s.push(arr[0]);
	     for(int i=1;i<n;i++)
	     {
	         Interval top=s.peek();
	         if(top.end<arr[i].start)
	           s.push(arr[i]);
	         else if(top.end<arr[i].end)
	         {
	             top.end=arr[i].end;
	             s.pop();
	             s.push(top);
	         }
	         
	         
	     }
	     Interval a[]=new Interval[s.size()];
	     int j=0;
	      while(!s.isEmpty())
	         {
	             Interval curr=s.peek();
	             a[j++]=curr;
	             s.pop();
	         }
	         Arrays.sort(a);
	        for(int i=0;i<a.length;i++)
	         {
	             
	             System.out.print(a[i].start+" "+a[i].end+" ");
	         }
	 }

}
