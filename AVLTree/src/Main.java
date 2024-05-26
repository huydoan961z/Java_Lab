public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.root = avlTree.insert(avlTree.root, new ContactBook("Alice Johnson", "555-0101", "alice.johnson@email.com"));
        avlTree.root = avlTree.insert(avlTree.root, new ContactBook("Bob Smith", "555-0102", "bob.smith@email.com"));
        avlTree.root = avlTree.insert(avlTree.root, new ContactBook("Charlie Davis", "555-0103", "charlie.davis@email.com"));
        avlTree.root = avlTree.insert(avlTree.root, new ContactBook("Diana Hayes", "555-0104", "diana.hayes@email.com"));

        avlTree.inOrder(avlTree.root);
        System.out.println("---");
        avlTree.preOrder(avlTree.root);
        System.out.println();

        Node node = avlTree.search("Alice Johnson");
        if (node != null) {
            System.out.println("Contact found: " + node.contactBook);
        } else {
            System.out.println("Contact not found");
        }

    }
}