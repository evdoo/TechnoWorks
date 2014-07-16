package thechnoworks.bynarytree;

public class BinTree {

    BinTreeItem root = null; //главный корень

    //поиск элемента по ключу. Проверяется, есть ли уже элемент с таким ключом.
    public BinTreeItem find(int key) {
        for (BinTreeItem v = root; v != null; v = key < v.key ? v.left : v.right) {
            if (key == v.key)
                return v;
        }
        return null;
    }

    //вставка элемента в дерево.
    public boolean addToTree(BinTreeItem root, int key) {
        //если дерево пустое, создаем корень.
        if (root == null) {
            root = new BinTreeItem(key, null, null);
            return true;
        }
        //начинаем вставку с корня, если дерево непустое.
        return addToTree(root, key);
    }

    //вставка элемента в поддерево.
    public boolean addToUnderTree(BinTreeItem node, int key) {
        //если новый ключ меньше текущего, идем налево.
        if (key < node.key) {
            if (node.left == null) {
                node.left = new BinTreeItem(key, null, null);
                return true;
            }
            return addToUnderTree(node.left, key);
        }
        //если новый ключ больше текущего, идем направо.
        if (key > node.key) {
            if (node.right == null) {
                node.right = new BinTreeItem(key, null, null);
                return true;
            }
            return addToUnderTree(node.right, key);
        }
        return false;
    }
}
