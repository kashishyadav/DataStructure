class gfg
{
        // Function  to split a circular LinkedList
          static int traverse(Node last) 
       { 
        Node p; 
    
        // If list is empty, return. 
        if (last == null) 
        { 
            System.out.println("List is empty."); 
            return 0; 
        } 
    
        // Pointing to first Node of the list. 
        p = last;
    
        // Traversing the list.
        int count=0;
        do
        { 
           count++;
            p = p.next; 
    
        } 
        while(p != last); 
        
        return count;
    
    } 
	    void splitList(circular_LinkedList list)
        {
             // Your code here
             Node curr=list.head;
             int count=traverse(list.head);
             if(count==1)
             {
                 list.head1=list.head;
                 list.head2=list.head.next;
                 list.head1.next=list.head1;
                 list.head2.next=list.head2;
             }
             else{
             list.head1=list.head;
             if(count%2==0)
              count=(count)/2;
             else
             {
                 count=(count)/2;
                 count++;
                 
             }
             
             Node temp=list.head;
             Node prev=list.head;
             while(count>0)
             {
                 prev=temp;
                 temp=temp.next;
                 count--;
             }
             prev.next=list.head1;
             list.head2=temp;
             
             Node t=list.head2;
             while(t.next!=list.head1)
             {
                 t=t.next;
             }
             t.next=list.head2;
             
             }
	 }
}
