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
	public static void main (String[] args) {
	    
	    ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(5);
	    for(int i=0;i<5;i++)
	    {
	        adj.add(new ArrayList<Integer>());
	    }
	     addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        
        printGraph(adj);
	}
}
