/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class IsomorphicTree {
     static int miniLevel=0;
      static class Node
      {
        int data;
        Node left;
        int d=0;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
            this.d=0;
        }
        public void setd_val(int d)
        {
            this.d=d;
        }
    }

  
    public static void main(String arg[])
    { 
        Node root1=new Node(8);
        root1.left=new Node(6);
        root1.left.right=new Node(7);
        root1.right=new Node(9);
        root1.right.right=new Node(10);
        Node root2=new Node(8);
        root2.left=new Node(6);
        root2.left.left=new Node(7);
        root2.right=new Node(9);
        root2.right.left=new Node(10);
        System.out.println("isomorphic : "+isIsomorphic(root1,root2));
       }
   
     public static Node addNode(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        else if(root.data<data)
        {
            root.right=addNode(root.right,data);
        }
        else{
            root.left=addNode(root.left,data);
        }
        return root;
    }
     
      public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            //Node p=q.peek();
            
            Node p=q.poll();     
            if(p==null && q.peek()==null)
                break;
            
            if(p==null)
            {
                q.add(null);
                System.out.println();
            } 
            else{
            System.out.print(p.data+" -> ");
            if(p.left!=null)
                q.add(p.left);
            
            if(p.right!=null)
                q.add(p.right);
            
            }
        }
        
    }
      public static boolean isIsomorphic(Node root1,Node root2){
          if(root1==null && root2==null)
              return true;
          if(root1==null || root2==null)
              return false;
          if(root1.data!=root2.data)
              return false;
          if(isIsomorphic(root1.left,root2.left)&&isIsomorphic(root1.right,root2.right)
                  ||isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left))
          {
              return true;
          }
          return false;
      }
}
