import java.util.ArrayList;
import java.util.Collections;

/**
 * @auther: WJoe
 * @Description: 小明很喜欢数学, 有一天他在做数学作业时, 要求计算出9~16的和,
 * 他马上就写出了正确答案是100。但是他并不满足于此,
 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,
 * 他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你
 * ,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @Date : 15:15 2018/8/4
 */
public class Problem41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum < 2)
            return lists;
        for (int i = 2; i < sum; i++) {
            int start = 0;
            int end = 0;
            if (2 * sum % i == 0) {
                int temp = 2 * sum / i;
                if ((i + temp - 1) % 2 == 0 && (temp - i + 1) % 2 == 0 && (temp - i + 1) / 2 > 0) {
                    end = (i + temp - 1) / 2;
                    start = (temp - i + 1) / 2;
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int j = start; j < end + 1; j++) {
                        list.add(j);
                    }
                    lists.add(list);
                }
            }
        }
        Collections.reverse(lists);
        return lists;
    }

    public static void main(String[] args) {
        Problem41 problem41 = new Problem41();
        problem41.FindContinuousSequence(3);
    }
}

