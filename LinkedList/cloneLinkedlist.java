class Clone {
 Node copyList(Node head) {
        if (head == null) return head;

        Node t = head;
        while (t != null) {
            Node n = new Node(t.data);
            // n.data=t.data;
            n.next = t.next;
            t.next = n;
            t = n.next;
        }
        t = head;
        Node head2 = head.next;
        while (t != null) {
            if (t.arb == null)
                t.next.arb = null;
            else {
                t.next.arb = t.arb.next;
            }
            t = t.next.next;
        }
        t = head;
        while (t != null) {
            t.next = t.next.next;
            t = t.next;
        }

        return head2;
    }
    Node copyList(Node head) {
        // your code here
        
        HashMap<Node,Node> hm=new HashMap<>();
        Node curr=head;
        Node clone=null;
        while(curr!=null)
        {
            clone=new Node(curr.data);
            hm.put(curr,clone);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null)
        {
            clone=hm.get(curr);
            clone.next=hm.get(curr.next);
            clone.arb=hm.get(curr.arb);
            curr=curr.next;
        }
        return hm.get(head);
        
      
    }
}
