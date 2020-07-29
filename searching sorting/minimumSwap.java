class GfG {
	// Function returns the minimum number of swaps 
	// required to sort the array 
	class pair{
	    int ind;
	    int ele;
	    pair(int ele,int ind)
	    {
	        this.ele=ele;
	        this.ind=ind;
	    }
	}
	public int minSwaps(int[] arr, int n) {
	    ArrayList<pair> list=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    list.add(new pair(arr[i],i));
	    
	    Collections.sort(list,new Comparator<pair>(){
	        public int compare(pair p1,pair p2)
	        {
	            return p1.ele-p2.ele;
	        }
	    });
	    boolean visit[]=new boolean[n];
	    Arrays.fill(visit,false);
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(visit[i]||list.get(i).ind==i)
	        continue;
	        
	        int j=i;
	        int cycle=0;
	        while(!visit[j])
	        {
	            visit[j]=true;
	            j=list.get(j).ind;
	            cycle++;
	        }
	        if(cycle>0)
	        {
	            count=count+(cycle-1);
	        }
	    }
	    return count;
	}
}
