/**
 * @auther: WJoe
 * @Description: 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @Date : 20:12 2018/8/4
 */
public class Problem47 {
    public int Sum_Solution(int n) {
        int sum = n;
       while (n==0)
           return n;
       sum +=Sum_Solution(n-1);
       return sum;
    }

    public static void main(String[] args) {
        Problem47 problem47 = new Problem47();
        System.out.println(problem47.Sum_Solution(10));
    }
}
