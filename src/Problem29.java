import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @auther: WJoe
 * @Description: 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 * @Date : 21:11 2018/8/1
 */
public class Problem29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input == null || input.length == 0 || k <= 0 || k > input.length)
            return arrayList;
        for (int i = 0; i < input.length; i++) {
            queue.add(input[i]);
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(queue.poll());
        }
        return arrayList;
    }


    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (k > length || k == 0) {
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

    public static void main(String[] args) {
        Problem29 problem29 = new Problem29();
        ArrayList<Integer> arrayList = problem29.GetLeastNumbers_Solution1(new int[]{1, 2, 5, 6, 8, 3, 5, 6, 9}, 4);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}
