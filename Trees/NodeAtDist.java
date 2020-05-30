/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class NodeAtDist {
    
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
        Node root=null;
        root=addNode(root,10);
        root=addNode(root,11);
        root=addNode(root,9);
       root=addNode(root,7);
        root=addNode(root,8);
        root=addNode(root,12);
        System.out.println("---------node at level 2----------------\n");
        NodeAtDistance(root,2);
      
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
    public static void NodeAtDistance(Node p,int d)
    {
        if(p==null)
            return;
        
        if(d==0)
        {
            System.out.println(p.data);
        }
        else{
            NodeAtDistance(p.left, d-1);
            NodeAtDistance(p.right,d-1);
        }
    }
}
