/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

//class Node
//{
//int data;
//Node left;
//Node right;
//
//public Node(int ddata, Node left, Node right)
//{
//    this.data = ddata;
//    this.left = null;
//    this.right =null;       
//}
//
//public void displayNode(Node n)
//{
//    System.out.print(n.data +" ");  
//}
//}


class BinaryTreeModified
{
Node root;
public BinaryTreeModified()
{
    this.root = null;
}
public void insertLeft(int parent,int leftvalue )
{
   
    Node n = find(root,parent);
    Node leftchild = new Node(leftvalue, null, null);
     while(n.left!=null){
    n = find(n.left,parent);
    leftchild = new Node(leftvalue, null, null);
    }
    n.left = leftchild;
      
}

public void insertRight(int parent, int rightvalue)
{
    Node n = find(root,parent);
    Node rightchild = new Node(rightvalue, null, null);
   while(n.right!=null){
    n = find(n.right,parent);
    rightchild = new Node(rightvalue, null, null);
    }
    n.right = rightchild;
}

public void insertRoot(int data)
{
    root = new Node(data, null, null);
}

public Node getRoot()
{
    return root;
}

public Node find(Node n,int key)
{       
    Node result = null;
    if (n == null)
        return null;
    if (n.data ==key)
        return n;
    if (n.left != null)
        result = find(n.left,key);
    if (result == null)
        result = find(n.right,key);
    return result;
} 

public int getheight(Node root)
{
    if(root == null)
        return  0;      
    return Math.max(getheight(root.left),getheight(root.right))+1; 
}

public void printTree(Node n)
{       
    if( n == null)
        return;
    printTree(n.left);
    n.displayNode(n);
    printTree(n.right);             
}





}