class Solution{
    static Node reverse(Node root)
    {
        Node prev=null;
        Node curr=root;
        Node next=root;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addLists(Node first, Node second){
        // code here
        // return head of sum list
        first=reverse(first);
        second=reverse(second);
        Node prev=null,temp=null,res=null;
        int sum=0,carry=0;
        while(first!=null || second!=null)
        {
            sum=carry+(first!=null?first.data:0 )+(second!=null?second.data:0);
            carry=sum>=10?1:0;
            sum=sum%10;
            temp=new Node(sum);
            if(res==null)
            {
                prev=temp;
                res=prev;
                //prev=res;
            }
            else
            {
                prev.next=temp;
                prev=temp;
            }
            if(first!=null)
            first=first.next;
            
            if(second!=null)
            second=second.next;
        }
        if(carry>0)
        temp.next=new Node(carry);
        
        return reverse(res);
      
    }
    public static void printList(Node root)
    {
        if(root==null)
        return;
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root=root.next;
        }
         System.out.println();
    }
}
