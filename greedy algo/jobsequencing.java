/*package whatever //do not write package name here */

import java.io.*;
import java.util.Arrays;
class Job implements Comparable<Job>
{
    char jobid;
    int profit;
    int dead;
    Job(char jobid,int dead,int profit)
    {
        this.jobid=jobid;
        this.profit=profit;
        this.dead=dead;
    }
    @Override
    public int compareTo(Job j)
    {
        if(this.profit<j.profit)
        return 1;
        else
        return -1;
    }
}

class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	 Job arr[] = {new Job('a', 2, 100), 
                     new Job('b', 1, 19), 
                     new Job('c', 2, 27), 
                     new Job('d', 1, 25), 
                     new Job('e', 3, 15)};
                     
        int n = arr.length;
        jobSequence(arr,n);
		
	}
	public static void jobSequence(Job arr[],int n)
	{
	    Arrays.sort(arr);
	    boolean place[]=new boolean[n];
	    int result[]=new int[n];
	    for(int i=0;i<n;i++)
	    place[i]=false;
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=Math.min(n,arr[i].dead)-1;j>=0;j--)
	        {
	            if(place[j]==false)
	            {
	                place[j]=true;
	                result[j]=i;
	                break;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(place[i]==true)
	        {
	            System.out.println(arr[result[i]].jobid+"  ");
	        }
	    }
	}
}
