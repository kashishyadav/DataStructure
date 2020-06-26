class DetectCycle
{ static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V)
    {
        // add your code here
        boolean visit[]=new boolean[V];
        boolean recstack[]=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(isCyclePresent(visit,recstack,adj,i))
              return  true;
        }
        return false;
    }
    static boolean isCyclePresent(boolean visit[],boolean recstack[],ArrayList<ArrayList<Integer>> g,int i)
    {
        if(recstack[i])
        return true;
        
        if(visit[i])
        return false;
        
        visit[i]=true;
        recstack[i]=true;
        
        ArrayList<Integer> child=g.get(i);
        for(int c:child)
        {
            if(isCyclePresent(visit,recstack,g,c))
              return true;
        }
        recstack[i]=false;
        return false;
    }
}
