/**
 * @auther: WJoe
 * @Description: 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 * @Date : 20:13 2018/8/3
 */
public class Problem39 {
    //后续遍历  判断左右子树深度
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return false;
        return haha(root) != -1;
    }

    private int haha(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        int left = haha(treeNode.left);
        int right = haha(treeNode.right);
        return (left >=0&&right>=0&&Math.abs(left-right)<=1)?1+Math.max(left,right):-1;
    }
}
