/**
 * @auther: WJoe
 * @Description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 公式 f(n) = f(n-1)+f(n-2)
 * @Date : 16:44 2018/7/30
 */
public class Problem8 {
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int n1 = 1;
        int n2 = 2;
        int num = 0;
        for (int i = 3; i <= target; i++) {
            num = n1 + n2;
            n1 = n2;
            n2 = num;
        }
        return num;
    }
}
