package thechnoworks.bynarytree;

public class TreeTraverse {

    public void INFIX_TRAVERSE(BinTreeItem root) {

        BinTreeItem underRoot = root;

        if (underRoot == null) {
            System.out.println("Tree is empty.");
        }
        else {
            underRoot = root.left;
        }


    }
}
