/**
 * @auther: WJoe
 * @Description: 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @Date : 16:19 2018/8/4
 */
public class Problem43 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < n)
            return "";
        StringBuilder sb1 = new StringBuilder(str.substring(0,n));
        StringBuilder sb2 = new StringBuilder(str.substring(n,str.length()));
        sb1 = getReverse(sb1);
        sb2 =getReverse(sb2);
        StringBuilder sb = getReverse(sb1.append(sb2));
        return sb.toString();
    }


    private StringBuilder getReverse(StringBuilder stringBuilder) {
        int start = 0;
        int end = stringBuilder.length()-1;
        while (start < end) {
            char c = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, c);
            start++;
            end--;
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        Problem43 problem43 = new Problem43();
        problem43.LeftRotateString("abcdefg",2);
    }
}
