import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @auther: WJoe
 * @Description: 在一个字符串(0<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * @Date : 16:14 2018/8/2
 */
public class Problem34 {
    public int FirstNotRepeatingChar(String str) {
        if (str ==null || str.length()==0)
            return -1;
        Map<Character ,Integer> map = new HashMap<>();
        LinkedList<Character > list = new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            if (!map.containsKey(str.charAt(i))){
                list.add(str.charAt(i));
                map.put(str.charAt(i),i+1);
            }else
                list.remove(Character.valueOf(str.charAt(i)));
        }

        if (list.size()==0)
            return -1;
        return map.get(list.get(0));
    }

    public static void main(String[] args) {
        Problem34 problem34 = new Problem34();
        problem34.FirstNotRepeatingChar("google");
    }
}
