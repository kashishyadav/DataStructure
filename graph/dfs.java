/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Graph {

     private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> l[];

    // Constructor
    Graph(int v)
    {
        V = v;
        l = new LinkedList[v];
        for (int i=0; i<v; ++i)
            l[i] = new LinkedList();
    }
    public  void addEdge(int u,int v)
    {
       l[u].add(v);
    }
    
    public  void dfs(int v)
    {
        boolean b[]=new boolean[V];
        dfsUtill(v,b);
    }
    public void dfsUtill(int v,boolean b[])
    {
         System.out.println(v+" ");
        b[v]=true;
        Iterator<Integer> i=l[v].listIterator();
        while(i.hasNext())
        {
            int h=i.next();
           
            if(!b[h])
            dfsUtill(h,b);
        }
        
    }
	public static void main (String[] args) {
	    
	    Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");

        g.dfs(2);
	}
}
