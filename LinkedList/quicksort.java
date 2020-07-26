class GfG
{
    public static Node quickSort(Node node)
    {
        //Your code here
        if(node==null)
        return null;
        else if(node.next==null)
        return node;
        Node temp=node;
        Node start=node;
        Node end=node;
        while(node.next!=null)
        {
            node=node.next;
        }
        end=node;
        //System.out.println(end.data);
        sort(start,end);
        return temp;
    }
    static Node paritionLast(Node start, Node end) 
   { 
    if(start == end ||  
       start == null || end == null) 
        return start; 
  
    Node pivot_prev = start; 
    Node curr = start;  
    int pivot = end.data;  
      
    // iterate till one before the end,  
    // no need to iterate till the end  
    // because end is pivot 
    while(start != end ) 
    { 
        if(start.data < pivot) 
        {  
            // keep tracks of last modified item 
            pivot_prev = curr;  
            int temp = curr.data;  
            curr.data = start.data;  
            start.data = temp;  
            curr = curr.next;  
        } 
        start = start.next;  
    } 
      
    // swap the position of curr i.e. 
    // next suitable index and pivot 
    int temp = curr.data;  
    curr.data = pivot;  
    end.data = temp;  
  
    // return one previous to current 
    // because current is now pointing to pivot 
    return pivot_prev; 
} 
  
static void sort(Node start, Node end) 
{ 
    if(start == end ) 
        return; 
          
    // split list and partion recurse 
    Node pivot_prev = paritionLast(start, end); 
    sort(start, pivot_prev); 
      
    // if pivot is picked and moved to the start, 
    // that means start and pivot is same  
    // so pick from next of pivot 
    if( pivot_prev != null &&  
        pivot_prev == start ) 
        sort(pivot_prev.next, end); 
          
    // if pivot is in between of the list, 
    // start from next of pivot,  
    // since we have pivot_prev, so we move two nodes 
    else if(pivot_prev != null &&  
            pivot_prev.next != null) 
        sort(pivot_prev.next, end); 
} 
    // public static void sort(Node start,Node end)
    // {
    //     if(start==end)
    //     return;
    //     Node pp=partition(start,end);
    //     sort(start,pp.next);
        
    //     if(pp.next!=null && pp==start)
    //     sort(pp.next,end);
    //     else if(pp.next!=null && pp.next.next!=null)
    //     sort(pp.next.next,end);
        
    // }
    // public static Node partition(Node start,Node end)
    // {
    //     if(start==end||start==null||end==null)
    //     return start;
        
    //     Node curr=start;
    //     Node pp=start;
    //     int pivot=end.data;
    //     while(start!=end)
    //     {
    //         if(start.data<pivot)
    //         {
    //             pp=curr;
    //             int temp=curr.data;
    //             curr.data=start.data;
    //             start.data=temp;
    //         }
    //         start=start.next;
    //     }
    //     int d=curr.data;
    //     curr.data=pivot;
    //     end.data=d;
        
    //     return pp;
    // }
    
}
