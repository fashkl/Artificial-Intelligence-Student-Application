/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Administrator
 */
public class pTwoChildNode{
    
    private pTwoChildNode root;
    Object data;
    pTwoChildNode left,right;
    
    
    protected pTwoChildNode getRoot(){
        return root;
    }
 

    public pTwoChildNode(){
        data = null;
        left = right = null;
    }
    public pTwoChildNode(Object d){
        data = d;
        left = right = null;
    }
    public void setLeft(pTwoChildNode l){
        left = l;
    }
    public void setRight(pTwoChildNode r){
        right = r;
    }
    public void setData(Object d){
        data = d;
    }
    public pTwoChildNode getLeft(){
        return left;
    }
    public pTwoChildNode getRight(){
        return right;
    }
    public Object getData(){
        return data;
    }
    public String toString(){
        return ""+data;
    }
    
   
   
   
    
    
    
    
}