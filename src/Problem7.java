/**
 * @auther: WJoe
 * @Description: 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 n<=39
 * @Date : 16:37 2018/7/30
 */
public class Problem7 {
    public int Fibonacci(int n) {
        if (n==0)
            return 0;
        if(n==1)
            return 1;
        int n0 =0;
        int n1 = 1;
        int num = 0;
        for (int i = 0; i <=n ; i++) {
            num =n0+n1;
            n0 = n1;
            n1 =num;
        }
        return  num;
    }
}
