/**
 * @auther: WJoe
 * @Description:
 * @Date : 14:43 2018/8/2
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem32 {

    public String PrintMinNumber(int [] numbers) {

        if (numbers == null || numbers.length == 0)
            return null;
      ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <numbers.length ; i++) {
            arrayList.add(numbers[i]);
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2 +""+o1;
                return s1.compareTo(s2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
        }

        return sb.toString();
    }
}
