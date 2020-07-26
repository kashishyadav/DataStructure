class Solution
{
    public static Node deleteAtPosition(Node head, int pos)
    {
        // your code here
        if(head==null)
        {
            return null;
        }
        if(head.next==head && pos==1)
        {
            return null;
        }
        if(pos==1)
        {
         Node curr=head;
         Node prev=head.next;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=prev;
        return prev;
        }
        else{
        Node curr=head;
        Node prev=head;
        pos=pos-1;
        while(curr.next!=head && pos-->0)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
        }
    }
}
