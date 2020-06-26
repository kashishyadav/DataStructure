class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
         Node p=head;
         Node start=p.next;
         if(head==null)
         return null;
         
         if(head.next==null)
         return head;
         
         if(start.next==null)
         {
             start.next=p;
             p.next=null;
             return start;
         }
         Node temp=null;
         Node q=null;
         while(true)
         {
              q=p.next;
              temp=q.next;
              q.next=p;
              if(temp==null || temp.next==null)
              {
                  p.next=temp;
                  break;
              }
              p.next=temp.next;
              p=temp;
         }
         return start;
        
        
    }
    
    
    
    
    
    
}
