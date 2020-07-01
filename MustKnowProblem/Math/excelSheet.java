import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
      
    static HashMap<Character,Integer> hm=new HashMap<>();
    public static void valueFill( HashMap<Character,Integer> hm)
    {
        int v=1;
        for(char ch='A';ch<='Z';ch++)
        {
            hm.put(ch,v);
            v++;
        }
    }
	public static void main (String[] args)throws IOException
	 {
	 //code
	 valueFill(hm);
	  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(bf.readLine());
	 while(t-->0)
	 {
	     String s=bf.readLine();
	     //System.out.print(s+" "+s.length()+" "+s.charAt(0));
	     
	     if(s.length()==1)
	     System.out.println(hm.get(s.charAt(0)));
	     else
	      System.out.println(excelSheet(s));
	 }
	 
	 }
	 public static int excelSheet(String s)
	 {
	     int sum=0;
	     int h=26;
	     for(int i=0;i<s.length();i++)
	     {
	        sum*=26;
	         sum+=s.charAt(i)-'A'+1;
	     }
	     return sum;
	 }
	 
}
