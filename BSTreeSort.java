
 
import java.util.Arrays;
import java.util.Scanner;
 
class Node	{
     public Node left, right;
     public int data;
 
     public Node()	{
         left = null;
         right = null;
         data = 0;
     }
     
     public Node(int n)	{
         left = null;
         right = null;
         data = n;
     }
 }
 
 class BSTreeSort	{
     public Node root;
     private int[] values;
     
     public BSTreeSort(int[] tree)	{
         root = null;
         
         values = new int[tree.length];
         values = Arrays.copyOf(tree, tree.length);
     }

	 
     public int[] Sort()	{
         for (int i=0;i<values.length;++i)
             insert(values[i]);
         
         return values;
     }
     
     public void insert(int data)	{
         root = insert(root, data);
     }

	 //add recursively
     private Node insert(Node node, int data)	{
         if (node == null)
             node = new Node(data);
         else	{
             if (data <= node.data)
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
     
     public void printInOrder(Node n) 	{
        if (n != null) 	{
            printInOrder(n.left);
            System.out.print(n.data + ",");
            printInOrder(n.right);
        }
     }
 }
