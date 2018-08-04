import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: WJoe
 * @Description: 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @Date : 15:52 2018/8/4
 */
public class Problem42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0 || sum < array[0])
            return list;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                list.add(sum - array[i]);
                list.add(array[i]);
            } else
                map.put(sum - array[i], array[i]);
        }
        if (list.size() ==0)
            return list;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(list.get(list.size()-2));
        result.add(list.get(list.size()-1));
        return  result;
    }
}
