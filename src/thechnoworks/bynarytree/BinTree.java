package thechnoworks.bynarytree;

public class BinTree {

    static BinTreeItem root = null; //главный корень

    //поиск элемента по ключу. Проверяется, есть ли уже элемент с таким ключом.
    public static BinTreeItem find(int key) {
        for (BinTreeItem v = root; v != null; v = key < v.key ? v.leftChild : v.rightChild) {
            if (key == v.key)
                return v;
        }
        return null;
    }

    //вставка элемента в дерево.
    public static boolean addToTree(BinTreeItem root, int key) {
        //если дерево пустое, создаем корень.
        if (root == null) {
            root = new BinTreeItem(key, null, null, null);
            return true;
        }
        //начинаем вставку с корня, если дерево непустое.
        return addToTree(root, key);
    }

    //вставка элемента в поддерево.
    public static boolean addToUnderTree(BinTreeItem node, int key) {
        //если новый ключ меньше текущего, идем налево.
        if (key < node.key) {
            if (node.leftChild == null) {
                node.leftChild = new BinTreeItem(key, null, null, node);
                return true;
            }
            return addToUnderTree(node.leftChild, key);
        }
        //если новый ключ больше текущего, идем направо.
        if (key > node.key) {
            if (node.rightChild == null) {
                node.rightChild = new BinTreeItem(key, null, null, node);
                return true;
            }
            return addToUnderTree(node.rightChild, key);
        }
        return false;
    }

    //проход дерева.
    public static BinTreeItem INFIX_TRAVERSE(BinTreeItem root) {

        if (root == null) {
            System.out.println("Tree is empty.");
        }
        else {
            if (root.leftChild != null) {
                return INFIX_TRAVERSE(root.leftChild);
            }
        }

        return root;
    }
}
