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
public class AncestorNode {
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
//        Node root=null;
//        root=addNode(root,10);
//        root=addNode(root,11);
//        root=addNode(root,9);
//       root=addNode(root,7);
//        root=addNode(root,8);
//        root=addNode(root,12);
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        System.out.println("---------ancestor are----------------\n");
        Queue<Node>q=new LinkedList<>();
        ancestor(root,6,q);
          System.out.println("stack s1: ");
        while(!q.isEmpty())
        {
            System.out.print(q.poll().data+" ");
        }
        Queue<Node>q1=new LinkedList<>();
        ancestor(root,4,q1);
        System.out.println("stack s1: ");
        while(!q1.isEmpty())
        {
            System.out.print(q1.poll().data+" ");
        }
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
    public static boolean ancestor(Node root,int target,Queue<Node> q)
    {
        if(root==null)
            return false;
        
        if(root.data==target)
            return true;
        
        if(ancestor(root.left,target,q) || ancestor(root.right,target,q))
        {
            System.out.println(root.data);
            q.add(root);
            return true;
        }
        
        return false;
        
    }
    
    
}
