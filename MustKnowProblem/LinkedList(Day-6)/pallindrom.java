class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node root=head;
        if(head==null || head.next==null)
        return true;
        boolean set=true;
        Node first=head;
        Node second=head;
        while(true)
        {
            head=head.next.next;
            if(head==null)//node even
            {
                first=second.next;
                break;
            }
            if(head.next==null)//node is odd skip middle node
            {
                first=second.next.next;
                break;
            }
            
            second=second.next;
        }
        second.next=null;
        first=reverse(first);
        second=root;
        
          while(first!=null && second!=null)
        {
            //System.out.println(first.data+" "+second.data);
            if(first.data!=second.data)
            {
                //System.out.println("not equal data "+first.data+" "+second.data);
                set=false;
                break;
            }
            first=first.next;
            second=second.next;
        }
        return set;
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
    public static Node reverse(Node root)
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
}
