
public class BinaryTree {

    public TreeItem mainRoot;

    public BinaryTree(TreeItem root) {
     this.mainRoot = root;
    }

    /*public static String isLeaf(TreeItem root) {
        if (root.leftChild == null) {
            if (root.rightChild == null) {
                return root.toString();
            } else {
                return isLeaf(root.rightChild);
            }
        }
        else {
                if (root.rightChild == null) {
                    return isLeaf(root.leftChild);
                }
                else {
                    return isLeaf(root.leftChild);
                }
        }
    }*/

    public boolean isLeaf(TreeItem node) {
        return (node.leftChild == null && node.rightChild == null);
    }

    //прохождение дерева.
    public void print(TreeItem node) {
        boolean f = isLeaf(node.leftChild);
        boolean s = isLeaf(node.rightChild);
        if (!f) {
            print(node.leftChild);
        }
        else {
            node.leftChild.toString();
            node.toString();
            if (!s) {
                print(node.rightChild);
            } else {
                node.rightChild.toString();
            }
        }
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
