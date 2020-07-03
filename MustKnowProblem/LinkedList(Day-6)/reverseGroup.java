class GfG
{
   // static int count=0;
    public static Node reverse(Node head, int k)
    {
        //Your code here
        int count=0;
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        head.next=reverse(next,k);
        
        return prev;
    }
}
