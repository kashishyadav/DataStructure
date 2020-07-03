class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    public Node rotate(Node head, int k)
    {
        if (k == 0) return head;
        
        Node walk = head;
        Node prev = null;
        
        while( k-->0 && walk!=null )
        // this loop is run k number of times
        // walk pointer moves k nodes ahead and reaches new head node
        {
            prev = walk;
            walk = walk.next;
        }
        if(walk==null) return head; // considering edge case, i.e. if k==n
        
        Node newHead = walk;
        // since 'prev' points to the node placed before newHead
        // it is new tail, hence prev->next should be NULL
        prev.next = null;
        
        while( walk.next != null )
            // walking till the last node
            walk = walk.next;
        
        // connecting last node to old head
        walk.next = head;
        return newHead;
    }
    
   
}
