package thechnoworks.bynarytree;

public class TreeTraverse {

    public BinTreeItem INFIX_TRAVERSE(BinTreeItem root) {

        if (root == null) {
            System.out.println("Tree is empty.");
        }
        else {
            if (root.left != null) {
                return INFIX_TRAVERSE(root.left);
            }
        }

    return root;
    }
}
