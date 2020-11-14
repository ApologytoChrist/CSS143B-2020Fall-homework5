package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        TreeNode<Integer> current = root;

        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }



        return result;  // place holder
    }
}
