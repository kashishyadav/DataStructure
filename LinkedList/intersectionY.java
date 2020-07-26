static int intersectPoint(Node head1, Node head2)
    {
        int n1=0, n2=0;
        Node temp=null;
        
        for(temp = head1; temp!=null; temp=temp.next)
            n1+=1;
            // finding length of list 1
        
        for(temp = head2; temp!=null; temp=temp.next)
            n2+=1;
            // finding length of list 2
        
        for(  ; n1>n2 ; n1-=1 )
            head1 = head1.next;
            // if list1 is longer, we ignore some of its starting
            // elements till it has as many elements as list2
        
        for(  ; n2>n1 ; n2-=1 )
            head2 = head2.next;
            // similarly
            // if list2 is longer, we ignore some of its starting
            // elements till it has as many elements as list1
        
        while( head1 != head2 )
        {
            head1 = head1.next;
            head2 = head2.next;
            // now we simple traverse ahead till we get the
            // intersection point, if there is none, this loop
            // will break when both pointers point at NULL
        }
        
        if(head1!=null) return head1.data;
        // if head1 is not NULL, we return its data
        return -1;       // otherwise we return -1
    }
}
