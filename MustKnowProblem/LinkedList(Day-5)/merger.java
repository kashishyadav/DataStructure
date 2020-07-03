class LinkedList
{
    public Node sortedMerge(Node A, Node B)  
    { 
      
        if(A == null) return B; 
        if(B == null) return A; 
          
        if(A.data < B.data)  
        { 
            A.next = sortedMerge(A.next, B); 
            return A; 
        } 
        else 
        { 
            B.next = sortedMerge(A, B.next); 
            return B; 
        } 
          
    } 
    }
