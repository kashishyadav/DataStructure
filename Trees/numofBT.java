/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class NumOfBt {
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
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of tree nodes: ");
        int t=sc.nextInt();
        System.out.println("No. of possible tree: "+noofBT(t));
                   
    }

     public static int noofBT(int n)
     {
         int arr[]=new int[n+1];
         arr[0]=arr[1]=1;
         for(int i=2;i<=n;i++)
         {
             arr[i]=0;
             for(int j=0;j<i;j++)
             {
                 arr[i]+=arr[j]*arr[i-j-1];
             }
         }
         return arr[n];
     }
 

}
