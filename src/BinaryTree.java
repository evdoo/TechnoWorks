
public class BinaryTree {

    //проверка, является ли данный элемент листом. Если у него нет детей - является.
    public static boolean isLeafLeft(TreeItem node) {
        return (node.leftChild == null);
    }

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
        //если левый элемент - лист, вывести его значение и значение его корня.
        else {
            System.out.println(node.leftChild.toString());
            System.out.println(node.toString());
            //если у корня есть правое поддерево, вызвать метод, передав в него корень этого поддерева.
            if (!s) {
                infixTraverse(node.rightChild);
            } else {
                System.out.println(node.rightChild.toString());
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
