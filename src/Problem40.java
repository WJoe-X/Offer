import java.util.HashMap;
import java.util.Map;

/**
 * @auther: WJoe
 * @Description:一个整型数组里除了两个数字之外， 其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 * <p>
 * 异或运算 两个数抑或为0。
 * @Date : 14:20 2018/8/4
 */
public class Problem40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 0)
            return;
        if (array.length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        int index = 0;
        while ((result & 1) == 0 && index < 32) {
            result >>= 1;
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >> index & 1) == 1)
                num1[0] ^= array[i];
            else num2[0] ^= array[i];
        }

    }

    public static void main(String[] args) {
        Problem40 problem40 = new Problem40();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        problem40.FindNumsAppearOnce(new int[]{2, 4, 3, 6, 3, 2, 5, 5}, num1, num2);
    }
}
