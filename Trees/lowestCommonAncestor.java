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
public class lowestCommonAncestor {
    
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
   static class pair{
       int data;
       int h;
       pair(int data,int h)
       {
           this.data=data;
           this.h=h;
       }
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
               //  bfs(root[k]);
            System.out.println("enter a: ");
            int a=sc.nextInt();
            System.out.println("enter b: ");
            int b=sc.nextInt();
              Node n1=lca(root[k],a,b);
              System.out.println("ancestor: "+n1.data);
                // printVertical(root[k]);
                 
         }
//         Node root = new Node(1); 
//        root.left = new Node(2); 
//        root.right = new Node(3); 
//        root.left.left = new Node(4); 
//        root.left.right = new Node(5); 
//        root.right.left = new Node(6); 
//        root.right.right = new Node(7); 
//        System.out.println("LCA(4, 5): " + lca(root,4,5).data); 
//        System.out.println("LCA(4, 6): " + lca(root,4,6).data); 
//        System.out.println("LCA(3, 4): " + lca(root,3,4).data); 
//        System.out.println("LCA(2, 4): " + lca(root,2,4).data); 

       }

   public static Node lca(Node root,int a,int b)
   {
       if(root==null)
           return null;
       if(root.data==a || root.data==b)
           return root;
       Node left=lca(root.left,a,b);
       Node right=lca(root.right,a,b);
       if(right!=null && left!=null)
           return root;
       else{
           return (left!=null)?left:right;
       }
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
//    public static void lowestAncestor(Node root,int a,int b)
//    {
//        Stack<Integer> s1=new Stack<>();
//        Stack<Integer> s2=new Stack<>();
//        ancestor(root, a, s1);
//        ancestor(root, b, s2);
//        while(!s1.isEmpty()&&!s2.isEmpty())
//        {
//            if(s1.peek()==s2.peek()&&s1.peek()!=root.data)
//            {
//                break;
//            }
//            s1.pop();
//            s2.pop();
//        }
//        if(s1!=null && s2!=null)
//        System.out.println("ancestor is: "+s1.pop());
//        else
//          System.out.println("ancestor is: root "+root.data);  
//    }
//    public static boolean ancestor(Node root,int target,Stack<Integer> s)
//    {
//        if(root==null)
//            return true;
//        if(target==root.data)
//            return true;
//        if(ancestor(root.left,target,s)||ancestor(root.right, target,s))
//        {
//            s.push(root.data);
//            return true;
//        }
//        return false;
//    }
// public static Node lca(Node root, int a,int b)
//	{
//System.out.println("============================================================================= ");
//        Queue<Node> s1=new LinkedList<>();
//        ancestor(root, a, s1);    
//          Queue<Node> s12=new LinkedList<>();
//        ancestor(root, a, s12);   
//         System.out.println("queue q1:------------------------------------------ ");
//        while(!s12.isEmpty())
//        {
//            System.out.print(s12.poll().data+" ");
//        }
//         
//        Queue<Node> s2=new LinkedList<>();
//        ancestor(root, b, s2);
//         Queue<Node> s22=new LinkedList<>();
//        ancestor(root, a, s22);   
//         System.out.println("queue q2:------------------------------------------ ");
//        while(!s22.isEmpty())
//        {
//            System.out.print(s22.poll().data+" ");
//        }
//        int len1=s1.size();
//        int len2=s2.size();
//        while(!s1.isEmpty()&&!s2.isEmpty())
//        {
//            if(s1.peek().data==s2.peek().data && s1.peek().data!=root.data)
//            {
//                break;
//            }
//            
//            if(len1>len2)
//            {
//                if(s1.peek().data>s2.peek().data)
//             {
//                    s1.poll();
//
//             }
//            else
//             s2.poll();
//            }
//            else{
//             if(s1.peek().data<s2.peek().data)
//             {
//                    Node e=s2.poll();
//
//             }
//            else
//             s1.poll();
//            }
//        }
//        System.out.println("\npeek element; "+s1.peek().data);
//        if(!s1.isEmpty() && !s2.isEmpty())
//        return s1.poll();
//        else
//        return root;
//
//        }
//   public static boolean ancestor(Node root,int target,Queue<Node> s)
//    {
//        if(root==null)
//            return false;
//        if(target==root.data)
//        {
//            System.out.println(root.data+" "+target);
//            s.add(root);
//            return true;
//        }
//        if(ancestor(root.left,target,s)||ancestor(root.right, target,s))
//        {
//            s.add(root);
//            //System.out.print(root.data+" ");
//            return true;
//        }
//        return false;
//    }
}
