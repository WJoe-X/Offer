/**
 * @auther: WJoe
 * @Description: 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @Date : 21:41 2018/8/6
 */
public class Problem52 {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        if (str.length == 0 && pattern.length == 0)
            return true;
        if (str.length != 0 && pattern.length == 0)
            return false;
        int strIndex = 0;
        int patternIndex = 0;
        while (patternIndex <= pattern.length) {
            if (patternIndex == pattern.length && strIndex == str.length)
                return true;
            if (patternIndex < pattern.length - 1 && pattern[patternIndex+1] == '*') {
                if (pattern[patternIndex] == '.' || pattern[patternIndex] == str[strIndex]) {
                    while (strIndex < str.length - 1 && str[strIndex] == str[strIndex + 1]) {
                        strIndex++;
                    }
                } else {
                    patternIndex += 2;
                }

            } else if (str[strIndex] == pattern[patternIndex]) {
                patternIndex++;
                strIndex++;
            } else if (str[strIndex] != pattern[patternIndex] && pattern[patternIndex] == '.')
            {
                patternIndex++;
            }else return false;

        }
        return strIndex == str.length ;

    }

    public static void main(String[] args) {
        Problem52 problem52 = new Problem52();
        char[] char1 = "".toCharArray();
        char[] char2 = ".*".toCharArray();
        System.out.println(problem52.match(char1, char2));
    }
}