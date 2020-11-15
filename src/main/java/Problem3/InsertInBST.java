package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        if (root == null) {
            return;
        }

        TreeNode<Integer> current = root;
        while (current!= null) {
            boolean goLeft = current.val > valToInsert;
            if (goLeft) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new TreeNode<>(valToInsert);
                    break;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new TreeNode<>(valToInsert);
                    break;
                }
            }
        }
    }
}
