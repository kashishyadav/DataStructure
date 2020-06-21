import java.util.*;
import java.lang.*;
import java.io.*;

class meeting implements Comparable<meeting>{
    int start;
    int finish;
    int index;
    meeting(int start,int finish,int index)
    {
        this.start=start;
        this.finish=finish;
        this.index=index;
    }
    @Override
    public int compareTo(meeting m)
    {
        return this.finish-m.finish;
        //return m.finish-this.finish;
    }
}


class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code
	 BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(bf.readLine());
	 while(t-->0)
	 {
	     int n=Integer.parseInt(bf.readLine());
	     
	     String str[]=bf.readLine().split(" ");
	     String str1[]=bf.readLine().split(" ");
	     
	     meeting arr[]=new meeting[n];
	     
	     for(int i=0;i<str.length;i++)
	     arr[i]=new meeting(Integer.parseInt(str[i]),Integer.parseInt(str1[i]),i+1);
	     
	     
	     meetingHeld(arr,n);
	     System.out.println();
	 }
	 }
	 public static void meetingHeld(meeting arr[],int n)
	 {
	     Arrays.sort(arr);
	     ArrayList<Integer> al=new ArrayList<>();
	     al.add(arr[0].index);
	     int j=0;
	     for(int i=1;i<n;i++)
	     {
	         
	         if(arr[j].finish<arr[i].start)
	            {
	                al.add(arr[i].index);
	                j=i;
	                
	            }
	     }
	     for(int i=0;i<al.size();i++)
	     System.out.print(al.get(i)+" ");
	     
	 }
}
