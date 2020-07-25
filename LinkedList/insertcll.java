class GfG
{
	public static void insert(Node zhead,int value,int n)
         {
            //add code here.
             Node temp=new Node(value);
             Node curr=zhead;
            if(curr==null)
            {
              
                temp.next=temp;
                zhead=temp;
            }
            else if(curr.data>=temp.data)
            {
                
                while(curr.next!=zhead)
                {
                    curr=curr.next;
                }
                curr.next=temp;
                temp.next=zhead;
                zhead=temp;
                
            }
            else 
            {
                //Node curr=zhead;
                while(curr.next!=zhead && curr.next.data<temp.data)
                {
                    curr=curr.next;
                }
                temp.next=curr.next;
                curr.next=temp;
            }
          traverse(zhead);
         }
           static void traverse(Node last) 
    { 
        Node p; 
    
        // If list is empty, return. 
        if (last == null) 
        { 
            System.out.println("List is empty."); 
            return; 
        } 
    
        // Pointing to first Node of the list. 
        p = last;
    
        // Traversing the list. 
        do
        { 
            System.out.print(p.data + " "); 
            p = p.next; 
    
        } 
        while(p != last); 
    
    } 
}
