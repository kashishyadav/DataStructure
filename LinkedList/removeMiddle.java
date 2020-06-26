class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null)
        return head;
        else if(head.next==null)
        return head;
        else if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        Node start=head;
        Node temp=head;
        Node remove=head;
        
        while(temp!=null && temp.next!=null)
        {
            if(temp.next.next!=null)
            temp=temp.next.next;
            else
            temp=null;
            
            remove=head;
            head=head.next;
        }
        if(remove!=null && head!=null)
        remove.next=head.next;
        
        return start;
    }
}
