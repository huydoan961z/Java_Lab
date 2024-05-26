/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avltree;

/**
 *
 * @author aser
 */
public class AVLTree 
{
    private int size;
    private AVLTree root;

    public AVLTree() {
        this.size = 0;
        this.root = null;
    }
    
    public int size()
    {
        return this.size;
    }
    public int height(AVLTree node)
    {
       return(node==null)? 0 : node.height; 
    }
    
    public void insert(int key)
    {
        this.root=insert(this.root, key);
    }
    private AVLNode insert(AVLNode node, int key)
            return null;
    
}
