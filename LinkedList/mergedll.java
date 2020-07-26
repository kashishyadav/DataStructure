class LinkedList
{
    static Node sortDoubly(Node head)
    {
        // add your code here
         if(head==null || head.next==null)
        return head;
        
        Node temp1=getMiddle(head);
        Node middle=temp1.next;
        middle.prev=null;
        temp1.next=null;
        
        Node left=sortDoubly(head);
        Node right=sortDoubly(middle);
        
        Node res=merge(left,right);
        return res;
    }
 static Node getMiddle(Node head)
    {
        if(head==null)
        return null;
        
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node merge(Node a,Node b)
    {
        Node res=null;
        if(a==null)
        return b;
        if(b==null)
        return a;
        
        if(a.data<=b.data)
        {
            
            a.next=merge(a.next,b);
            a.next.prev=a;
            a.prev=null;
            return a;
        }
        else
        {
            
            b.next=merge(a,b.next);
            b.next.prev=b;
            b.prev=null;
            return b;
        }
        // return res;
    }
  

}
