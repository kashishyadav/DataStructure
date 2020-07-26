class GfG
{
    public static Node partition(Node l, Node h)
    {
        
        
        Node pp=l.prev;
        int pivot=h.data;
        Node curr=l;
        while(curr!=h)
        {
            if(curr.data<=pivot)
            {
                pp=(pp==null)?l:pp.next;//start from prev that in initial is first node p
                //pointing to null
                int temp=pp.data;
                pp.data=curr.data;
                curr.data=temp;
            }
            curr=curr.next;
        }
               pp=(pp==null)?l:pp.next;
                int temp=pp.data;
                pp.data=curr.data;
                curr.data=temp;
        
        return pp;
    }
}
