import java.util.ArrayList;
/**
 * @auther: WJoe
 * @Description: 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一
 * 直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @Date : 16:04 2018/8/1
 */
public class Problem24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || root.val > target) {
            return lists;
        }
        list.add(root.val);
        target = target - root.val;
        if (target == 0 && root.left == null && root.right == null)
            lists.add(list);
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return lists;
    }


}
