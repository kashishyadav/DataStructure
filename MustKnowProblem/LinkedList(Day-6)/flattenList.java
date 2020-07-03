class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	  if(root==null || root.next==null)
	  return root;
	  
	  root.next=flatten(root.next);
	  root=merge(root,root.next);
	  return root;
    }
    Node merge(Node a,Node b)
    {
        if(a==null)
        return b;
        
        if(b==null)
        return a;
        
        Node temp;
        if(a.data<b.data)
        {
            temp=a;
            temp.bottom=merge(a.bottom,b);
        }
        else
        {
            temp=b;
            temp.bottom=merge(a,b.bottom);
        }
        temp.next=null;
        return temp;
    }
}
