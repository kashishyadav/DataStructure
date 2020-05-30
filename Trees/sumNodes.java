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
public class sumNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public static int sumOfAllNodes(Node root)
    {
       // static int sum=0;
        
        if(root==null)
            return 0;
        
        int sum=root.data+ sumOfAllNodes(root.left)+sumOfAllNodes(root.right);
         
         return sum;
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
    public static boolean sumTree(Node root)
    {
        if(root==null)
            return true;
       
        if(root.left==null && root.right==null)//leafnodes
            return true;
        
        int leftsum=sumOfAllNodes(root.left);
        int rightsum=sumOfAllNodes(root.right);
        int total=leftsum+rightsum;
        if(root.data==total)
        {
            if(sumTree(root.left)&&sumTree(root.right))
            return true;
        }
        return false;
    }
    public static void main(String arg[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of tree: ");
        int t=sc.nextInt();
        Node root[]=new Node[t];
        int h=t;
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
        for(int k=0;k<h;k++)
        {
            System.out.println("bfs traversal for tree "+(k+1)+"\n");
            bfs(root[k]);
            System.out.println("sum of tree:"+k+" "+sumOfAllNodes(root[k]));
           // System.out.println("sumtree "+sumTree(root[k]));
           
        }
        Node temp=new Node(56);
        temp.left=new Node(13);
        temp.right=new Node(15);
        temp.right.left=new Node(9);
        temp.right.right=new Node(3);
        temp.right.right.left=new Node(2);
        temp.right.right.right=new Node(11);
        temp.left.left=new Node(5);
        temp.left.right=new Node(3);
        temp.left.left.left=new Node(3);
        temp.left.left.right=new Node(2);
        
        System.out.println("is sum tree: "+sumTree(temp));
      
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
        System.out.println();
        
    }

}
