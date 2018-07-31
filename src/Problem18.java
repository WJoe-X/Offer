import sun.reflect.generics.tree.Tree;

/**
 * @auther: WJoe
 * @Description: 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @Date : 14:52 2018/7/31
 */
public class Problem18 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public void Mirror(TreeNode root) {
     if (root ==null)
         return;

     if (root.left == null &root.right==null)
         return;
     TreeNode temp  = new TreeNode(0);
     temp = root.left;
     root.left = root.right;
     root.right = temp ;
     if (root.left != null)
         Mirror(root.left);
     if (root.right !=null)
         Mirror(root.right);
    }



}
