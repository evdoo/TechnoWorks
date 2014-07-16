package thechnoworks.bynarytree;

public class BinTreeItem {

    public int key;
    public BinTreeItem left;
    public BinTreeItem right;

    public BinTreeItem(int key, BinTreeItem left, BinTreeItem right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}
