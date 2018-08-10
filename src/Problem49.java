/**
 * @auther: WJoe
 * @Description: 将一个字符串转换成一个整数(实现Integer.valueOf ( string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 * @Date : 20:55 2018/8/6
 */
public class Problem49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int sum = 0;
        int times = 1;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            for (int i = str.length() - 1; i > 0; i--) {
                if ('0' > str.charAt(i) || str.charAt(i) > '9') {
                    return 0;
                } else {
                    sum += (str.charAt(i) - '0') * times;
                    times *= 10;
                }
            }
            if (str.charAt(0) == '-') {
                sum *= (-1);
            }
            return sum;
        } else if (str.charAt(0) < '9' && str.charAt(0) > '0') {
            for (int i = str.length() - 1; i >= 0; i--) {
                if ('0' > str.charAt(i) || str.charAt(i) > '9') {
                    return 0;
                } else {
                    sum += (str.charAt(i) - '0') * times;
                    times *= 10;
                }
            }
            return sum;
        } else return 0;
    }

    public static void main(String[] args) {
        Problem49 problem49 = new Problem49();
        System.out.println( problem49.StrToInt("123"));
    }
}
