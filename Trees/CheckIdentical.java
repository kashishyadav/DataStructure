/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class CheckIdentical {
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
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of tree: ");
        int t=sc.nextInt();
        Node root[]=new Node[t];
        int j=0;
        while(t>0)
        {
            System.out.println("enter the number of nodes: ");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("enter the nodes: ");
                root[j]=addNode(root[j],sc.nextInt());
            }
            --t;
            j++;
            
        }
        //root=addNode(root,10);
        for(int k=0;k<2;k++)
        {
            System.out.println("bfs traversal for tree "+(k+1)+"\n");
            bfs(root[k]);
        }
        
        
       System.out.println("---------check identical----------------\n"+checkIdentical(root[0],root[1])+" ");
        
    }
       public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
      //  q.add(root);
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
    public static boolean checkIdentical(Node root1,Node root2)
    {
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        
        return root1.data==root2.data && checkIdentical(root1.left,root2.left) && checkIdentical(root1.right,root2.right);
    }
}
