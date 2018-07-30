/**
 * @auther: WJoe
 * @Description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……
 * 它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 公式f(n)=f(n-1)+f(n-2)+...f(1)
 * @Date : 16:49 2018/7/30
 */
public class Problem9 {
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return (int) Math.pow(2, target - 1) + 1;
    }
}