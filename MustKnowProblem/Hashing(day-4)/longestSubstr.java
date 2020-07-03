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
	     
	     String str=bf.readLine();
	    
	     
	     System.out.println(longestSubstr(str,str.length()));
	 }
	 
	 }
	 public static int longestSubstr(String str,int n)
	 {
	     int max=0;
	     for(int i=0;i<n;i++)
	     {
	         int temp=findLength(str,new HashSet<Character>(),i);
	         //System.out.println("i: "+i+" temp: "+temp);
	         max=Math.max(temp,max);
	         //System.out.println("max: "+max);
	         
	     }
	     return max;
	 }
	 public static int findLength(String str,HashSet<Character>hs,int index)
	 {
	    // HashSet<Character>hs=new HashSet<>();
	     int count=0;
	     for(int i=index;i<str.length();i++)
	     {
	         if(hs.contains(str.charAt(i)))
	          {
	              //System.out.println("count: "+count+" char: "+str.charAt(i));
	              return count;
	          }
	          else
	          {
	              hs.add(str.charAt(i));
	              count++;
	          }
	          //System.out.println(hs);
	     }
	     return count;
	 }
}
