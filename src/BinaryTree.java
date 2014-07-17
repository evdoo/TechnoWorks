
public class BinaryTree {

    public TreeItem mainRoot;

    public BinaryTree(TreeItem root) {
     this.mainRoot = root;
    }

    public String isLeast(TreeItem root) {
        if (root.leftChild == null && root.rightChild == null) {
            return root.toString();
        }
        else if (root.leftChild == null) {
            return
        }
    }

    //прохождение дерева.
    public static void print(BinaryTree tree) {
        //поиск крайнего левого элемента.

    }

    //вписывание элемента в дерево.
    public static boolean addToTree(TreeItem node, int key) {
        if (key < node.keyTree) {
            if (node.leftChild == null) {
                node.leftChild = new TreeItem(key, null, null);
            }
        return addToTree(node.leftChild, key);
        }
        if (key > node.keyTree) {
            if (node.rightChild == null) {
                node.rightChild = new TreeItem(key, null, null);
            }
        return addToTree(node.rightChild, key);
        }
        return false;
    }
}
