/**
 * @auther: WJoe
 * @Description: 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * @Date : 21:09 2018/8/7
 */
public class Problem53 {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }

        for (int i = 0; i < str.length; i++) {
            if (str[0] != '+' && str[0] != '-' &&(str[0]<'0'||str[0]>'9'))
                return false;

        }
return  true;
    }


    public static void main(String[] args) {
        Problem53 problem53 = new Problem53();
        char[] chars = new char[]{'+'};
        problem53.isNumeric(chars);
    }
}
