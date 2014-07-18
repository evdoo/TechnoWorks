import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //создаем главный корень дерева.
        String mainRootStringKey = reader.readLine();
        if (mainRootStringKey.equals("ShowTree")) {
            System.out.println("Tree is empty.");
        } else {
            int mainRootKey = Integer.parseInt(mainRootStringKey);
            final TreeItem mainRoot = new TreeItem(mainRootKey);

            //ввод ключей. при вводе "ShowTree" ввод прекращается и дерево проходится по заданному правилу.
            while (true) {
                String stringKey = reader.readLine();
                if (stringKey.equals("ShowTree")) {
                    BinaryTree.infixTraverse(mainRoot);
                    break;
                } else {
                    int key = Integer.parseInt(stringKey);
                    BinaryTree.addToTree(mainRoot, key);
                }
            }
        }
    }
}