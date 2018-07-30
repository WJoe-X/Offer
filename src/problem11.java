/**
 * @auther: WJoe
 * @Description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @Date : 18:15 2018/7/30
 */
public class problem11 {

    public int NumberOf1(int n) {
        if (n == 0)
            return 0;
        int sum = 0;
        while (n !=0){
        sum++;
        n= n&(n-1);
        }
        return sum;
    }
}
