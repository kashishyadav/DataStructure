
class solver
{
     
  
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        // if(head==null)
        // return;
        
        // Node p=head;
        // Node q=head.next;
        // while(p!=null && q!=null && q.next!=null)
        // {
        //     p=p.next;
        //     q=q.next.next;
        //     if(p==q)
        //     {
               
        //         break;
        //     }
        // }
        // if (p==q) { 
        //     q = head; 
        //     while (p.next != q.next) { 
        //         p = p.next; 
        //         q = q.next; 
        //     } 
  
           
        //     p.next = null; /* remove loop */
        // }
         if(head==null) return;
        
        Node fast = head.next;
        Node slow = head;
        
        while( fast != slow )
        {
            if( fast==null || fast.next==null ) return;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        int size = 1;
        fast = fast.next;
        while( fast != slow )
        {
            size += 1;
            fast = fast.next;
        }
        
        slow = head;
        fast = head;
        for(int i=0; i<size-1; i++)
            fast = fast.next;
        
        while( fast.next != slow )
        {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = null;
        
    }
    
}
