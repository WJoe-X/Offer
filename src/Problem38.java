import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther: WJoe
 * @Description: 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 * @Date : 19:52 2018/8/3
 */
public class Problem38 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        public int TreeDepth(TreeNode root) {
            if (root == null)
                return 0;
            int left = TreeDepth(root.left);
            int right = TreeDepth(root.right);
            return Math.max(left, right) + 1;
        }

        //非递归 层次遍历
        public int TreeDepth1(TreeNode root) {
            if (root == null)
                return 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int count = 0;
            int depth = 0;
            int nextCount=1;
            while (queue != null) {
                root = queue.poll();
                count++;
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            if (count ==nextCount){
                count =0;
                nextCount = queue.size();
                depth++;
            }
            }
            return depth;
        }

    }
}
