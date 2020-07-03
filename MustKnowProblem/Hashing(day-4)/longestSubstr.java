import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static int longestSubstr(String s,int n)
	 {
	     HashSet<Character> hs=new HashSet<>();
	     int max=0;
	     int i=0,j=0;
	     while(i<n && j<n)
	     {
	         if(!hs.contains(s.charAt(j)))
	         {
	             hs.add(s.charAt(j));
	             j++;//increament thse pointer upto when no char is repeat
	             max=Math.max(max,j-i);
	             
	         }
	         else
	         {
	             hs.remove(s.charAt(i));
	             i++;//now change starting index as index j char get repated
	         }
	     }
	     return max;
	 }
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
