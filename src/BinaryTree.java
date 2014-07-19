
public class BinaryTree {

    //проверка, есть ли у элемента дети слева.
    public static boolean isLeafLeft(TreeItem node) {
        return (node.leftChild == null);
    }

    //есть ли у элемента дети справа.
    public static boolean isLeafRight(TreeItem node) {
        return (node.rightChild == null);
    }

    //прохождение дерева.
    public static void infixTraverse(TreeItem node) {
        boolean f = isLeafLeft(node);
        boolean s = isLeafRight(node);
        //если есть левое поддерево, вызвать метод, засунув туда корень этого поддерева.
        if (!f) {
            infixTraverse(node.leftChild);
        }
            System.out.println(node.toString());
            //если у корня есть правое поддерево, вызвать метод, передав в него корень этого поддерева.
            if (!s) {
                infixTraverse(node.rightChild);
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
