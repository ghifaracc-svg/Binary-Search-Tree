public class BinarySearchTree {

    Node root;

    // INSERT
    public Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // FIND
    public boolean find(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return find(root.left, key);

        return find(root.right, key);
    }

    // Mencari node terkecil (Inorder Successor)
    public Node minValue(Node root) {

        while (root.left != null)
            root = root.left;

        return root;
    }

    // DELETE
    public Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {

            // Tidak punya anak
            if (root.left == null && root.right == null)
                return null;

            // Satu anak
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Dua anak
            Node successor = minValue(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // DISPLAY (Inorder)
    public void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    // COUNT NODE
    public int countNodes(Node root) {

        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

}