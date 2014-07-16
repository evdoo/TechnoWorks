
public class BinaryTree {

    public static TreeItem mainRoot;

    public BinaryTree(TreeItem root) {
        this.mainRoot = root;
    }

    //прохождение дерева.
    public static void infixTraverse(BinaryTree tree) {
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
