/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
class Node
{
    int data;
    Node left,right;
}
public class BST {
    private Node root;
    public BST()
    {
        root=null;
    }
    public void insert(int val)
    {
        Node temp,ptr;
        temp=new Node();
        temp.data=val;
        temp.left=null;
        temp.right=null;
        if(root==null)
        {
            root=temp;
        }
        else
        {
                ptr=root;
                while(ptr!=null)
                {
                        if(val>ptr.data)
                        {
                            if(ptr.right==null)
                            {
                                ptr.right=temp;
                                break;
                            }
                            else
                                ptr=ptr.right;
                        }
                        else if(val<ptr.data)
                        {
                            if(ptr.left==null)
                            {
                                ptr.left=temp;
                                break;
                            }
                            else
                                ptr=ptr.left;
                        }
                        else
                        {
                            System.out.println("Duplicate value not allowed");
                            break;
                        }
                    }
        }
    }
public void preorder(Node ptr)
{
    if(ptr==null)
        return;
    System.out.print("\t"+ptr.data);
    preorder(ptr.left);
    preorder(ptr.right);
}
public void inorder(Node ptr)
{
    if(ptr==null)
        return;
    inorder(ptr.left);
    System.out.print("\t"+ptr.data);
    
    inorder(ptr.right);
}
public void postorder(Node ptr)
{
    if(ptr==null)
        return;
    postorder(ptr.left);
    postorder(ptr.right);
    System.out.print("\t"+ptr.data);
    
}

        public void traverse()
        {
            System.out.println("\nPreorder Traversal ");
            preorder(root);
            System.out.println("\nInorder Traversal ");
            inorder(root);
            System.out.println("\nPostorder Traversal ");
            postorder(root);
            
            
        }
                            
                        
                
        
    
}
