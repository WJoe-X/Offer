/**
 * @auther: WJoe
 * @Description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @Date : 16:04 2018/7/30
 */
public class Problem6 {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        if (array[0]<array[right])
            return array[0];
        while (left < right) {
            int mid = (left + right) / 2;
            if (right - left == 1) {
                return array[right];
            } else if (array[mid] > array[left]) {
                left = mid;
            } else if (array[mid] < array[left]) {
                right = mid;
            }else if (array[mid] == array[left]){
                left = left+1;
            }

        }
        return -1;
    }

}
