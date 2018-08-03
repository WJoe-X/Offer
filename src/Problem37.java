package TODO;

/**
 * @auther: WJoe
 * @Description: 统计一个数字在排序数组中出现的次数。
 * @Date : 17:04 2018/8/3
 */
public class Problem37 {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0)
            return 0;
        if (k < array[0] || k > array[array.length - 1])
            return 0;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (right +left) / 2;
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid - 1;
            } else {
                right = mid;
                left = mid;
                if (right+1<=array.length&&array[right+1] == k)
                    right++;
                if (left-1>=0&&array[left-1]==k)
                    left --;

            }
        }
        return right - left;


    }
}
