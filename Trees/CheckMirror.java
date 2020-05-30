/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class CheckMirror {
     static class Node{
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    public static void main(String str[])
    {
        Node root1=null;
        root1=addNode(root1,10);
        root1=addNode(root1,11);
        root1=addNode(root1,9);
        root1=addNode(root1,7);
        root1=addNode(root1,8);
        root1=addNode(root1,12);
        
        Node root2=null;
//        root2=addNode(root2,10);
//        root2=addNode(root2,11);
//        root2=addNode(root2,9);
//        root2=addNode(root2,7);
//        root2=addNode(root2,8);
//        root2=addNode(root2,12);
//        root2=new Node(10);
//        root2.left=new Node(11);
//        root2.left.left=new Node(12);
//        root2.right=new Node(9);
//        root2.right.right=new Node(7);
//        root2.right.right.left=new Node(8);
        System.out.println("---------bfs root1----------------\n");
        Node n1=root1;
        bfs(root1);
        System.out.println("---------bfs root2----------------\n");
        //root2=Mirror(root1);
        root2=mirrorify(root1);
        Node n2=root2;
        bfs(root2);
          CheckMirror c=new CheckMirror();
        System.out.println(" "+c.areMirror(root1,root2));
      
        //System.out.println("is mirror: "+isMirror(n1,n2)+" ");
      //  bfs(n1);
        //bfs(n2);
       
    }
    static Node mirrorify(Node root)  
{  
    if (root == null)  
    {  
        return null;  
          
    }  
  
    // Create new mirror node from original tree node    
    Node mirror = new Node(root.data);  
    mirror.right = mirrorify(root.left);  
    mirror.left = mirrorify(root.right); 
    return mirror;  
}  
    public static Node addNode(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
       else if(data<root.data)
        {
            root.left=addNode(root.left,data);
        }
       else{
           root.right=addNode(root.right,data);
       }
        return root;
    }
    public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node n=q.peek();
            q.poll();
            if(n.left!=null)
                q.add(n.left);
            
            if(n.right!=null)
                q.add(n.right);
            
            System.out.print(n.data+" -> ");
        }
        
    }
    public static boolean isMirror(Node root1,Node root2)
    {
        System.out.println("fn call");
        if(root1==null && root2==null)
        {
            System.out.println(root1.data+"  "+root2.data+" return true");
            return true;
        }
        if(root1==null || root2==null)
        {
            System.out.println(root1.data+"  "+root2.data+"  return false");
            return false;
        }
        
        if(root1.data==root2.data) 
        {
            System.out.println(root1.data+"  "+root2.data);
            if(isMirror(root1.left,root2.right)&& isMirror(root2.right,root1.left))
            {
                return true;
            }
         //   return false;
        }
     return false;
       //return root1.data==root2.data && isMirror(root1.left,root2.right)&& isMirror(root2.right,root1.left);
    }
     boolean areMirror(Node a, Node b)  
    { 
        /* Base case : Both empty */
        if (a == null && b == null) 
            return true; 
  
        // If only one is empty 
        if (a == null || b == null)  
            return false; 
  
        /* Both non-empty, compare them recursively 
           Note that in recursive calls, we pass left 
           of one tree and right of other tree */
        return a.data == b.data 
                && areMirror(a.left, b.right) 
                && areMirror(a.right, b.left); 
    } 
    public static Node makeMirror(Node root)
    {
        if(root==null)
            return null;
        
        
        Node mirror=new Node(root.data);
        root.right=makeMirror(root.left);
        root.left=makeMirror(root.right);
        return mirror;
        
    }
    
      public static Node Mirror(Node root)
    {
         Queue<Node> q=new LinkedList<>();
         Node t=root;
        q.add(root);
        while(!q.isEmpty())
        {
            Node n=q.peek();
            q.poll();
            
           // swap(n.left,n.right);
           Node temp=n.left;
           n.left=n.right;
           n.right=temp;
            
            if(n.left!=null)
                q.add(n.left);
            
            if(n.right!=null)
                q.add(n.right);
            
            //System.out.print(n.data+" -> ");
        }
        return t;
    }  
    
    
}
