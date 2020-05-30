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
public class BFStraversal {
    
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
        System.out.println("---------bfs----------------\n");
        bfs(root);
       
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
}
