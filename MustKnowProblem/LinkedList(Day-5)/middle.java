class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int count=0;
         Node prev=head;
         Node curr=head;
         if(head!=null)
         {
             
             while(curr!=null && curr.next!=null)
             {
                 curr=curr.next.next;
                 prev=prev.next;
             }
             
         }
         return prev.data;
    }
}
