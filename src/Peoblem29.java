import java.util.HashMap;
import java.util.Map;

/**
 * @auther: WJoe
 * @Description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @Date : 20:39 2018/8/1
 */
public class Peoblem29 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i]))
                map.put(array[i], 1);
            else map.put(array[i], map.get(array[i])+1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > (array.length / 2))
                return e.getKey();
        }
        return 0;

    }
    public int MoreThanHalfNum_Solution1(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
    int count = 1;
        int cur = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i]==cur){
                count++;
            }else count--;

            if (count ==0){
                cur = array[i];
                count=1;
            }
        }
        count = 0;
        for (int i = 0; i <array.length ; i++) {
            if (cur == array[i])
                count++;
        }
        if (count>(array.length/2))
            return cur;
        else return 0;
    }

}
