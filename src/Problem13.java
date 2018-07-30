/**
 * @auther: WJoe
 * @Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * 可以用 &   代替  % 当且仅当 除数为2的倍数， 那么&（2的倍数-1）即  &01111111
 * @Date : 18:44 2018/7/30
 */
public class Problem13 {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0)
            return;

        int oddCount = 0;
        int odd = 0;

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1)
                oddCount++;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1)
                newArray[odd++] = array[i];
            else
                newArray[oddCount++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
    }
}
