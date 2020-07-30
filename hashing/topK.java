	/*class pair
	{
		int first;
		int second;
		pair(int first, int second){
			this.first = first;
			this.second = second;
		}
	}*/
	
	static ArrayList<Integer> TopK(ArrayList<Integer> array, int k) 
	{
	   ArrayList<Integer> result = new ArrayList<>(); // ArrayList to store elements that have top k frequencies
		
		HashMap <Integer,Integer> ump = new HashMap<>(); // frequency map

		// add all elements to frequency map
		for(int i=0; i<array.size(); i++){
			if(!ump.containsKey(array.get(i)))
			{
				ump.put(array.get(i), 1);
			}
			else
			{ 
				ump.put(array.get(i), ump.get(array.get(i))+1);
			}
		}
		
		//get all key values from map
		ArrayList<Integer> keys = new ArrayList<>(ump.keySet());
		
		// convert frequency map to ArrayList
		ArrayList<pair > frequency = new ArrayList<>();
		
		for(int val : keys)
		{
			frequency.add( new pair( val, ump.get(val)) );
		}
		
		// sort frequency vector using user defined compare function
		Collections.sort(frequency, new comp());
		
		// add first k elements from sorted vector to result 
		for(int i=0; i<k; i++)
			result.add (frequency.get(i).first);
		
		return result;
		
	}
	
	
	//comparator sort
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2)
		{
			// If 2 elements have same frequency then return larger element
			if(o1.second==o2.second)
				return o2.first-o1.first;
			
			// Else return element with larger frequency
			else return o2.second-o1.second;
		}
	}
	
}
