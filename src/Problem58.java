import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @auther: WJoe
 * @Description: 述
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推
 * @Date : 10:32 2018/8/14
 */
public class Problem58 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists =new ArrayList<>();
        if(pRoot ==null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        boolean oddLevel = true;
        queue.add(pRoot);
        int start = 0;
        int end = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node =  queue.remove();
            start ++;
            if(oddLevel){
                list.add(node.val);
            }else{
                stack.push(node.val);
            }
            if(node.left !=null)
                queue.add(node.left);
            if(node.right !=null)
                queue.add(node.right);
            if(start == end){
                end = queue.size();
                start = 0;
                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }
                lists.add(list);
                list = new ArrayList<>();
                oddLevel = !oddLevel;
            }

        }
        return lists;
    }
}
