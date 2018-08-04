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
        int mid = (right + left) / 2;
        while (left <= right) {
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid - 1;
            } else {
                break;
            }
        }
        right = mid;
        left = mid;
        while (right + 1 <= array.length-1) {
            if (array[right + 1] == k)
                right++;
            else break;
        }
        while (left - 1 >= 0) {
            if (array[left - 1] == k)
                left--;
            else break;
        }
        return right - left + 1;


    }

    public static void main(String[] args) {
        Problem37 problem37 = new Problem37();
        System.out.println(problem37.GetNumberOfK(new int[]{1,2,3,3,3,3},3));
    }
}
