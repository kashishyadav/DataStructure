class Tree
{
    // Return 1 if all the nodes in the tree satisfy the given property. Else return 0
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null)
        return 1;
        if(root.left==null && root.right==null)
        return 1;
        
        if(root.left!=null && root.right!=null)
        {
            if(root.data!=(root.left.data+root.right.data))
            return 0;
        }
        if(sum(root))
        return 1;
        
        return 0;
        
        
    }
    static boolean chk=false;
    public static boolean sum(Node root)
    {
        if(root==null)
        return false;
        
        if(root.left==null && root.right==null)
        return true;
        
        if(root.left==null && root.right!=null)
        {
            if(root.data==(root.right.data))
            return sum(root.right);
            else
            return false;
        }
     if(root.left!=null && root.right==null)
        {
            if(root.data==(root.left.data))
               return sum(root.left);
            else
            return false;
        }
        
        if(root.left!=null && root.right!=null && root.data==(root.left.data+root.right.data))
        {
          if(sum(root.left)&& sum(root.right))
           {
               return true;
           }
           else{
               return false;
           }
                   }
        else{
            return false;
        }
        
        //return chk;
    }
}
