package Problem1;


import java.util.*;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }

        TreeNode<Integer> current = root;
        queue.add(current);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                current = queue.poll();
                    level.add(current.val);
                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
            result.add(level);
        }
        return result;  // place holder
    }
}

