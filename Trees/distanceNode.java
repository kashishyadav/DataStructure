class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        if(root==null || root.left==null && root.right==null)
        return 0;
       Node lca = lca(root,a,b);
		return distance(lca,a, 0) + distance(lca,b, 0);
    }
    int distance(Node root,int key,int d)
    {
        if(root==null)
        return -1;
        
        if(root.data==key)
        return d;
        
        int l=distance(root.left,key,d+1);
        
        return l==-1?distance(root.right,key,d+1):l;
    }
    Node lca(Node root,int a,int b)
    {
        if(root==null || root.data==a || root.data==b)
         return root;
        
       Node left=lca(root.left,a,b);
       Node right=lca(root.right,a,b);
       
       if(left!=null && right!=null)
       return root;
       
       return left!=null?left:right;
       
       
    }
    
}
