import java.util.Comparator;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:37 2018/8/11
 */
public class Wangyi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] apples = new int[n];
        apples[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            apples[i] = scanner.nextInt() + apples[i - 1];
        }
        int m = scanner.nextInt();
        int[] ints = new int[m];
        for (int i = 0; i < m; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            System.out.println(getOutput(apples, ints[i])+1);
        }
    }
    private static int getOutput(int[] apples, int input) {
        int start = 0;
        int end = apples.length - 1;
        int mid = 0;
        while (start <= end) {
            if (end == start)
                return end;
            mid = (start + end) / 2;
            if (apples[mid] < input)
                start = mid + 1;
            else
                end = mid;
        }
        return mid;
    }
}
