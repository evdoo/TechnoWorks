
public class TreeItem {

    public int keyTree;
    public TreeItem leftChild;
    public TreeItem rightChild;

    public TreeItem(int key) {
        this.keyTree = key;
    }

    public TreeItem(int key, TreeItem left, TreeItem right) {
        this.keyTree = key;
        this.leftChild = left;
        this.rightChild = right;
    }
}
