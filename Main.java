public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Tree awal sesuai soal
        int[] data = {
                63,
                15, 98,
                13, 20,
                11, 14, 16, 25,
                89, 112,
                72, 95
        };

        for (int x : data)
            bst.root = bst.insert(bst.root, x);

        System.out.println("========== TREE AWAL ==========");
        bst.inorder(bst.root);

        // Insert nilai dari 2 digit terakhir NIM
        int nim = 57;
        bst.root = bst.insert(bst.root, nim);

        System.out.println("\n\n===== SETELAH INSERT 57 =====");
        bst.inorder(bst.root);

        // Delete node 98
        bst.root = bst.delete(bst.root, 98);

        System.out.println("\n\n===== SETELAH DELETE 98 =====");
        bst.inorder(bst.root);

        // Find
        System.out.println("\n\nFind 57 : " + bst.find(bst.root, 57));

        // Jumlah node
        System.out.println("Jumlah Node : " + bst.countNodes(bst.root));

    }
}