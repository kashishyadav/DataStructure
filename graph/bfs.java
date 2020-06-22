/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Graph {
    public static void addEdge(ArrayList<ArrayList<Integer>>al,int u,int v)
    {
        al.get(u).add(v);
        al.get(v).add(u);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>>al)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.println("vertex: "+i);
            for(int j=0;j<al.get(i).size();j++)
            {
              System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>>al)
    {
        int v=al.size();
        boolean isTraverse[]=new boolean[v+1];
        
        LinkedList<Integer> q=new LinkedList<>();
        for(int i=0;i<=v;i++)
         isTraverse[i]=false;
         
        int s=1;
        isTraverse[s]=true;
        q.add(s);
        
        while(q.size()!=0)
        {
             s=q.poll();
            System.out.print(s+" ");
            for(int j=0;j<al.get(s).size();j++) 
            {
                int h=al.get(s).get(j);
                if(isTraverse[h]==false)
                {
                    isTraverse[h]=true;
                    q.add(h);
                    
                }
            }
            
        } 
        
    }
	public static void main (String[] args) {
	    
	    ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(5);
	    for(int i=0;i<7;i++)
	    {
	        adj.add(new ArrayList<Integer>());
	    }
	     addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        
        bfs(adj);
	}
}
