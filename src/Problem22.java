import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @auther: WJoe
 * @Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Date : 17:07 2018/7/31
 */
public class Problem22 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<TreeNode> arrayListTree = new ArrayList<>();
        if (root == null)
            return arrayList;
        arrayList.add(root.val);
        arrayListTree.add(root);
        for (int i = 0; i < arrayListTree.size(); i++) {
            if (arrayListTree.get(i) != null) {
                if ((arrayListTree.get(i).left != null)) {
                    arrayListTree.add(arrayListTree.get(i).left);
                    arrayList.add(arrayListTree.get(i).left.val);
                }
                if ((arrayListTree.get(i).right != null)) {
                    arrayListTree.add(arrayListTree.get(i).right);
                    arrayList.add(arrayListTree.get(i).right.val);
                }
            }
        }
        return arrayList;
    }

}
