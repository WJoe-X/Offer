import java.util.LinkedList;
import java.util.List;

/**
 * @auther: WJoe
 * @Description: 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @Date : 22:13 2018/8/2
 */
public class Problem35 {

    public int InversePairs(int [] array) {
        if (array ==null || array.length ==0)
            return 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <array.length ; i++) {
            list.add(array[i]);
        }
        int count = 0;
        for (int i = 1; i <list.size() ; i++) {
            for (int j = 0; j <i ; j++) {
                if (list.get(j)>list.get(i)){
                    count +=(i-j);
                    int temp = list.get(i);
                    list.remove(i);
                    list.add(j,temp);
                    continue;
                }
            }
            
        }
        return  count;
    }

    public static void main(String[] args) {
        Problem35 problem35 = new Problem35();
        problem35.InversePairs(new int[]{364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575
});
    }
}
