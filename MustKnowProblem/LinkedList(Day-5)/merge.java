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
        Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node start=null;
     if(headA==null && headB==null)
     return null;
     
     if(headA.data<headB.data)
     {
         start=headA;
         if(headA.next!=null)
          headA=headA.next;
     }
     else
     {
         start=headB;
         if(headB.next!=null)
         headB=headB.next;
         
     }
      Node curr=start;
     while(headA!=null && headB!=null)
     {
         if(headB.data<=headA.data)
         {
             curr.next=headB;
             curr=headB;
             headB=headB.next;
         }
         else{
             curr.next=headA;
             curr=headA;
             headA=headA.next;
         }
     }
     if(headA!=null)
     {
         curr.next=headA;
     }
     if(headB!=null)
     {
         curr.next=headB;
     }
     return start;
  } 
    }
