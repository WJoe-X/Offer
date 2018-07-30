/**
 * @auther: WJoe
 * @Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Date : 10:52 2018/7/30
 */
public class Problem2 {

    public String replaceSpace(StringBuffer str) {
        String s = str.toString().replace(" ","%20");
        return s;


    }


}
