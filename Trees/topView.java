/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class topView {
    
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
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of tree: ");
//        int t=sc.nextInt();
//        Node root[]=new Node[t];
//        int h=t;
//        int j=0;
//        while(t>0)
//        {
//            System.out.println("enter the number of nodes: ");
//            int n=sc.nextInt();
//            for(int i=0;i<n;i++)
//            {
//                System.out.println("enter the nodes: ");
//                root[j]=addNode(root[j],sc.nextInt());
//            }
//            --t;
//            j++;
//            
//        }
//        //root=addNode(root,10);
//        for(int k=0;k<h;k++)
//        {
//               //  bfs(root[k]);
//                // printVertical(root[k]);
//                 
//         }
         Node root = new Node(1); 
    root.left = new Node(2); 
    root.right = new Node(3); 
    root.left.right = new Node(4); 
    root.left.right.right = new Node(5); 
    root.left.right.right.right = new Node(6); 
        topView(root);
       
    
    
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
     public static void topView(Node root)
     {
         HashMap<Integer,pair> hm=new HashMap<>();
         topTraversal(root, hm, 0, 0);
         for(Entry<Integer,pair> e:hm.entrySet())
         {
             System.out.print(e.getValue().data+" ");
         }
     }
     public static void topTraversal(Node root,HashMap<Integer,pair> hm,int h,int hd)
     {
         if(root==null)
             return;
         
         if(!hm.containsKey(hd))
         {
             
             hm.put(hd,new pair(root.data, h));
         }
         else{
             pair p=hm.get(hd);
             if(p.h>h)
             {
                 hm.remove(hd);
                  hm.put(hd,new pair(root.data, h));
             }
         }
         topTraversal(root.left,hm, h+1, hd-1);
         topTraversal(root.right, hm, h+1, hd+1);
     }
   
}
/*
1
2 
1 3 R 2 -1 N 2 4 R 3 5 L 3 -1 N 4 6 L 4 7 R 5 8 L 5 -1 N

static class pair{
       int data;
       int h;
       pair(int data,int h)
       {
           this.data=data;
           this.h=h;
       }
   }
import java.util.Map;
import java.util.TreeMap;

// Data structure to store a Binary Tree node
class Node
{
	int key;
	Node left = null, right = null;

	Node(int key) {
		this.key = key;
	}
}

// Pair class
class Pair<U, V>
{
	public final U first;   	// first field of a Pair
	public final V second;  	// second field of a Pair

	// Constructs a new Pair with specified values
	private Pair(U first, V second)
	{
		this.first = first;
		this.second = second;
	}

	// Factory method for creating a Typed Pair immutable instance
	public static <U, V> Pair <U, V> of(U a, V b)
	{
		// calls private constructor
		return new Pair<>(a, b);
	}
}

class Main
{
	// Recursive function to do a pre-order traversal of the tree and fill the map
	// Here node has 'dist' horizontal distance from the root of the
	// tree and level represent level of the node

	public static void printBottom(Node root, int dist, int level,
								   Map<Integer, Pair<Integer, Integer>> map)
	{
		// base case: empty tree
		if (root == null) {
			return;
		}

		// if current level is more than or equal to maximum level seen so far
		// for the same horizontal distance or horizontal distance is seen for
		// the first time, update the map

		if (!map.containsKey(dist) || level >= map.get(dist).second)
		{
			// update value and level for current distance
			map.put(dist, Pair.of(root.key, level));
		}

		// recur for left subtree by decreasing horizontal distance and
		// increasing level by 1
		printBottom(root.left, dist - 1, level + 1, map);

		// recur for right subtree by increasing both level and
		// horizontal distance by 1
		printBottom(root.right, dist + 1, level + 1, map);
	}

	// Function to print the bottom view of given binary tree
	public static void printBottom(Node root)
	{
		// create a TreeMap where
		// key -> relative horizontal distance of the node from root node and
		// value -> pair containing node's value and its level

		Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();

		// do pre-order traversal of the tree and fill the map
		printBottom(root, 0, 0, map);

		// traverse the TreeMap and print bottom view
		for (Pair<Integer, Integer> it: map.values()) {
			System.out.print(it.first + " ");
		}
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		printBottom(root);
	}
}
*/
