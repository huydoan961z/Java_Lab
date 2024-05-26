/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avltree;

/**
 *
 * @author aser
 */
public class AVLNode {
    public int key;
    public int height;
    public AVLNode left;
    public AVLNode right;
    
    public AVLNode(int key)
    {
        this.key=key;
        this.height=1;
        this.left=null;
        this.right=null;
    }
    public void printInfo()
    {
        System.out.println("key"+this.key+"height"+this.height);
    }
    
    public boolean greaterThan(int key)
    {
                    return this.key>key;

    }
    public boolean lessthan(int key)
    {
                    return this.key<key;

    }
    public boolean equal(int key)
    {
        return this.key==key;
    }
    
    
    
}
