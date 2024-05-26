public class Node {
    //public String key;
    ContactBook contactBook;
    int height;
    Node left, right;

    Node(ContactBook contactBook) {
        this.contactBook = contactBook;
        height = 1;
    }

   /* public Node(int key, int height, Node left, Node right) {
        this.key = key;
        this.height = height;
        this.left = left;
        this.right = right;
    }*/

    /*public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }*/
}
