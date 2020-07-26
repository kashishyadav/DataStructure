class LinkedList
{
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
            res=a;
            res.next=merge(a.next,b);
        }
        else
        {
            res=b;
            res.next=merge(a,b.next);
        }
        return res;
    }
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head==null || head.next==null)
        return head;
        
        Node temp1=getMiddle(head);
        Node middle=temp1.next;
        temp1.next=null;
        
        Node left=mergeSort(head);
        Node right=mergeSort(middle);
        
        Node res=merge(left,right);
        return res;
        
    }
}
