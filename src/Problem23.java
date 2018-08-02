/**
 * @auther: WJoe
 * @Description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @Date : 17:35 2018/7/31
 */
public class Problem23 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;

        return sq(sequence, 0, sequence.length - 1);

    }

    private static boolean sq(int[] sequence, int start, int end) {
        if (start>=end){
            return  true;
        }
        int root = sequence[end];
        int mid = start;
        while (mid<end&&sequence[mid]<root)
            mid++;
        for (int i = mid; i < end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }
      return  sq(sequence, start, mid - 1)&&sq(sequence, mid, end - 1);
    }

    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4, 5, 6, 7};
        Problem23 problem23 = new Problem23();
        if (problem23.VerifySquenceOfBST(s)) {
            System.out.println("66666666");
        }else System.out.println("999999999999");
    }
}
