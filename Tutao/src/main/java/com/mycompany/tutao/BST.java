/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutao;

/**
 *
 * @author aser
 */
public class BST 
{
    private PeopleNode root;
    private class PeopleNode
    {
        private People data;
        private PeopleNode left, right;
        public PeopleNode(People data)
        {
            this.data= data;
        }
        
    }
    public int height() {
        return height(root);
    }

    private int height(PeopleNode node) {
        if (node == null) {
            return -1;  // Height of empty tree is -1
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
    private int countNodes(PeopleNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
    public void insert(People people)
    {
        root= addBST(root, people);
    }
    public PeopleNode addBST(PeopleNode root, People people)
    {
        if(root==null)
        {
            root= new PeopleNode(people);
            return root;
        }
        if(root.data.compareTo(people)>0)
        {
            root.left=addBST(root.left, people);
        }
        else{
            root.right=addBST(root.right, people);
        }
        return root;
    }
    public PeopleNode search(PeopleNode root, int age) {
        if (root == null || root.data.getAge()==(age)) {
            return root;
        } else {
            if (root.data.getAge()< age) {
                return search(root.right, age);
            } else {
                return search(root.left, age);
            }
        }
    }
    public void delete(int age)
    {
        root= delete(root, age);
    }
    public PeopleNode delete(PeopleNode root,int age)
{
    if(root==null)
    {
        return root;
    }

    if(root.data.getAge()< age)
    {
        root.right = delete(root.right, age);
    }
    else if(root.data.getAge()>age)
    {
        root.left = delete(root.left, age);
    }
    else {
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            PeopleNode temp = minValue(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data.getAge());
        }
    }
    return root;
}

    private PeopleNode minValue(PeopleNode node) {
        if (node.left != null) {
            return minValue(node.left);
        }
        return node;
    }
    public void update(int oleAge, People newAge) {
        root = delete(root, oleAge);
        insert(newAge);
    }
    public boolean isValidBST() {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(PeopleNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data.getAge() <= min || node.data.getAge() >= max) {
            return false;
        }
        return isValidBST(node.left, min, node.data.getAge()) && isValidBST(node.right, node.data.getAge(), max);
    }

    public People findMax() {
        return findMax(root).data;
    }

    private PeopleNode findMax(PeopleNode node) {
        if (node.right == null) {
            return node;
        } else {
            return findMax(node.right);
        }
    }

    public People findMin() {
        return findMin(root).data;
    }

    private PeopleNode findMin(PeopleNode node) {
        if (node.left == null) {
            return node;
        } else {
            return findMin(node.left);
        }
    }

    public int countLessThanAge(int age) {
        return countLessThanAge(root, age);
    }

    private int countLessThanAge(PeopleNode node, int age) {
        if (node == null) {
            return 0;
        }
        if (node.data.getAge() < age) {
            return 1 + countLessThanAge(node.left, age) + countLessThanAge(node.right, age);
        } else {
            return countLessThanAge(node.left, age);
        }
    }

    public int countGreaterThanAge(int age) {
        return countGreaterThanAge(root, age);
    }

    private int countGreaterThanAge(PeopleNode node, int age) {
        if (node == null) {
            return 0;
        }
        if (node.data.getAge() > age) {
            return 1 + countGreaterThanAge(node.left, age) + countGreaterThanAge(node.right, age);
        } else {
            return countGreaterThanAge(node.right, age);
        }
    }

    public void printDescending() {
        printDescending(root);
    }

    private void printDescending(PeopleNode node) {
        if (node != null) {
            printDescending(node.right);
            System.out.println(node.data);
            printDescending(node.left);
        }
    }
    
    public void printPreOrder() {
    System.out.println("Pre-order: ");
    preOrder(root);
    System.out.println();
}

    public void printInOrder() {
        System.out.println("In-order: ");
        inOrder(root);
        System.out.println();
    }

    public void printPostOrder() {
        System.out.println("Post-order: ");
        postOrder(root);
        System.out.println();
    }

    public void preOrder(PeopleNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(PeopleNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(PeopleNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
    // Initialize the peopleArrayList in the BST class
    PeopleList.peopleArrayList.add(new People(2, "Huy"));
    PeopleList.peopleArrayList.add(new People(5, "Doan"));
    PeopleList.peopleArrayList.add(new People(9, "Huy"));
    PeopleList.peopleArrayList.add(new People(0, "Huy"));
    PeopleList.peopleArrayList.add(new People(8, "Huy"));
    PeopleList.peopleArrayList.add(new People(7, "Huy"));
    PeopleList.peopleArrayList.add(new People(1, "Huy"));
    PeopleList.peopleArrayList.add(new People(10, "Huy"));

    BST bst = new BST();
    if (PeopleList.peopleArrayList != null && !PeopleList.peopleArrayList.isEmpty()) {
        for (People p : PeopleList.peopleArrayList) {
            if (p != null) {
                bst.insert(p);
            }
        }
    } else {
        System.out.println("PeopleList.peopleArrayList is empty or not initialized");
    }
    
    
   //countmin,max
//     int x= bst.countGreaterThanAge(12);
//        System.out.println(x);
    
    
//    max,min
//    People x= bst.findMax();
//        System.out.println(x);
//    People y= bst.findMax();
//        System.out.println(y);
    
  //valid  
//    boolean n= bst.isValidBST();
//        System.out.println(n);
//  find node
//    PeopleNode foundNode = bst.search(bst.root, 1); // Replace 25 with the age you want to search
//        if (foundNode != null) {
//            System.out.println("Found a person with age: " +     foundNode.data.getAge());
//        } else {
//            System.out.println("No person found with the given age.");
//        }
    
//  insert and delete
//    People x= new People(14, "Huy");
//    PeopleList.peopleArrayList.add(x);
//    bst.insert(x);
//    PeopleNode foundNode = bst.search(bst.root, 14); // Replace 25 with the age you want to search
//    if (foundNode != null) {
//        System.out.println("Found a person with age: " +     foundNode.data.getAge());
//    } else {
//        System.out.println("No person found with the given age.");
//    }
//    bst.delete(14);
//    PeopleNode found = bst.search(bst.root, 14); // Replace 25 with the age you want to search
//    if (found != null) {
//        System.out.println("Found a person with age: " +     found.data.getAge());
//    } else {
//        System.out.println("No person found with the given age.");
//    }

        
    
    
    
    

//    bst.printPostOrder();
//    People newAge= new People(12, "Huy");
//    PeopleList.peopleArrayList.add(newAge);
//    bst.insert(newAge);
//    bst.printPostOrder();
//    bst.delete(10);
//    bst.printPostOrder();
//    PeopleNode x= bst.search(bst.root, 12);
//    
//    if(x!=null)
//            System.out.println("find");
//    
//    int n= bst.countGreaterThanAge(9);
//        System.out.println(""+n);
//    People a= bst.findMin();
//        System.out.println(""+a);
    
    }

   
}




/*
public class BST {
    // Existing code...

    public People findSuccessor(People people) {
        PeopleNode node = search(root, people.getAge());
        if (node == null) {
            return null;
        }
        if (node.right != null) {
            return minValue(node.right).data;
        } else {
            PeopleNode successor = null;
            PeopleNode ancestor = root;
            while (ancestor != node) {
                if (node.data.getAge() < ancestor.data.getAge()) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else {
                    ancestor = ancestor.right;
                }
            }
            return (successor != null) ? successor.data : null;
        }
    }

    public People findPredecessor(People people) {
        PeopleNode node = search(root, people.getAge());
        if (node == null) {
            return null;
        }
        if (node.left != null) {
            return findMax(node.left).data;
        } else {
            PeopleNode predecessor = null;
            PeopleNode ancestor = root;
            while (ancestor != node) {
                if (node.data.getAge() > ancestor.data.getAge()) {
                    predecessor = ancestor;
                    ancestor = ancestor.right;
                } else {
                    ancestor = ancestor.left;
                }
            }
            return (predecessor != null) ? predecessor.data : null;
        }
    }

    public People findLCA(People people1, People people2) {
        return findLCA(root, people1, people2).data;
    }

    private PeopleNode findLCA(PeopleNode node, People people1, People people2) {
        if (node == null) {
            return null;
        }
        if (node.data.getAge() > people1.getAge() && node.data.getAge() > people2.getAge()) {
            return findLCA(node.left, people1, people2);
        }
        if (node.data.getAge() < people1.getAge() && node.data.getAge() < people2.getAge()) {
            return findLCA(node.right, people1, people2);
        }
        return node;
    }
}
public static void main(String[] args) {
    // Existing code...

    People people1 = new People(5, "Doan");
    People people2 = new People(9, "Huy");
    System.out.println("Successor of " + people1 + ": " + bst.findSuccessor(people1));
    System.out.println("Predecessor of " + people1 + ": " + bst.findPredecessor(people1));
    System.out.println("Lowest Common Ancestor of " + people1 + " and " + people2 + ": " + bst.findLCA(people1, people2));
}
*/