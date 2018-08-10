/**
 * @auther: WJoe
 * @Description: 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @Date : 20:21 2018/8/6
 */
public class Problem48 {

    public int Add(int num1, int num2) {
        int sum=0;
        int temp=0;
        while (true) {
            sum = num1 ^ num2; // 先两个数不进位相加  就是异或操作
            temp = (num1 & num2) << 1; // 进位  与计算+位移
            num1 = sum;
            num2 = temp;
            if (temp == 0)
                break;
        }
        return sum;
    }
}
