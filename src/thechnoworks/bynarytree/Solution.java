package thechnoworks.bynarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //задаем главный корень - первый введенный с клавиатуры элемент.
        String stringRootKey = reader.readLine();
        int rootKey = Integer.parseInt(stringRootKey);
        BinTreeItem mainRoot = new BinTreeItem(rootKey, null, null, null);

        while (true) {
            String stringKey = reader.readLine();

            //при вводе "ShowTree" дерево проходится операцией INFIX_TRAVERSE и результат прохода выводится на экран.
            if (!stringKey.equals("ShowTree")) {
                //с клавиатуры вводятся ключи и встраиваются в дерево.
                int key = Integer.parseInt(stringKey);
                BinTreeItem root = BinTree.find(key);
                BinTree.addToTree(root, key);
            }

            else {
                break;
                //BinTree.INFIX_TRAVERSE(mainRoot);
            }
        }
    }
}
