public class AVLTree {
    Node root;

    int height(Node n) {
        if (n == null) return 0;
        return n.height;
    }

    int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public Node rightRotate(Node y) {
        Node x = y.left;
        Node z = x.right;

        // --> Rotation;
        x.right = y;
        y.left = z;

        //--> Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // --> return new root
        return x;
    }

    public Node leftRotate(Node x) {
        Node y = x.right;
        Node z = y.left;

        // --> Rotation;
        y.left = x;
        x.right = z;

        //--> Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // --> return new root
        return y;
    }

    public int getBalance(Node n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    public Node insert(Node node, ContactBook contactBook) {
        String key = contactBook.name;

        if (node == null) return (new Node(contactBook));

        if (key.compareTo(node.contactBook.name) < 0) node.left = insert(node.left, contactBook);
        else if (key.compareTo(node.contactBook.name) > 0) node.right = insert(node.right, contactBook);
        else return node;

        node.height = max(height(node.left), height(node.right)) + 1;

        int balance = getBalance(node);

        if (balance > 1 && key.compareTo(node.left.contactBook.name) < 0) return rightRotate(node);
        if (balance < -1 && key.compareTo(node.right.contactBook.name) > 0) return leftRotate(node);
        if (balance > 1 && key.compareTo(node.left.contactBook.name) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key.compareTo(node.right.contactBook.name) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    /*public Node search(String key) {
        return search(root, key);
    }*/

    /*public Node search(int key) {
        Node current = root;
        while (current != null) {
            if (current.key == key) break;
            if (current.key < key) current = current.right;
            else current = current.left;
        }
        return current;
    }*/

    /*public Node search(Node node, String key) {
        if (node == null || node.contactBook.name.equalsIgnoreCase(key)) return node;
        if (node.contactBook.name.compareTo(key) < 0) return search(node.right, key);
        return search(node.left, key);
    }*/

    public Node search(String name) {
        Node current = root;
        while (current != null) {
            if (current.contactBook.name.equals(name)) break;
            if (current.contactBook.name.compareTo(name) < 0) current = current.right;
            else current = current.left;
        }
        return current;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.contactBook);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.contactBook);
            inOrder(node.right);
        }
    }
}
