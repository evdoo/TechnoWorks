package thechnoworks.bynarytree;

public class BinTreeItem {

    public int key;
    public BinTreeItem leftChild;
    public BinTreeItem rightChild;
    public BinTreeItem parentItem;

    public BinTreeItem(int key, BinTreeItem left, BinTreeItem right, BinTreeItem parent) {
        this.key = key;
        this.leftChild = left;
        this.rightChild = right;
        this.parentItem = parent;
    }
}
