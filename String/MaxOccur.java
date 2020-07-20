class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String line){
        
        // Your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            if(!hm.containsKey(ch))
            {
                hm.put(line.charAt(i),1);
            }
            else{
                hm.put(line.charAt(i),(hm.get(line.charAt(i))+1));
            }
        }
        List<java.util.Map.Entry<Character,Integer>> l=new LinkedList<java.util.Map.Entry<Character,Integer>>(hm.entrySet());
        Collections.sort(l,new Comparator<java.util.Map.Entry<Character,Integer>>(){
            public int compare(java.util.Map.Entry<Character,Integer> o1,java.util.Map.Entry<Character,Integer> o2)
            {
                if(o2.getValue().compareTo(o1.getValue())==0)
                {
                    return (o1.getKey().compareTo(o2.getKey()));
                }
                else
                return (o2.getValue().compareTo(o1.getValue()));
                
            }
            });
            java.util.Map.Entry<Character,Integer> s=l.get(0);
            return s.getKey();
        
    }
    
}
