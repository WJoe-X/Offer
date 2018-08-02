import java.util.ArrayList;
import java.util.Collections;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 18:28 2018/8/1
 */
public class Problem28 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str == null || str.length() > 9) {
            return arrayList;
        }
        get(arrayList, str.toCharArray(), 0);
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void get(ArrayList arrayList, char[] chars, int i) {
        if (i == chars.length - 1) {
            String result = String.valueOf(chars);
            if (!arrayList.contains(result))
                arrayList.add(result);
        } else {
            for (int j = i; j < chars.length; j++) {
                swap(chars, i, j);
                get(arrayList, chars, i + 1);
                swap(chars, i, j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        Problem28 problem28 = new Problem28();
       ArrayList<String> s =problem28.Permutation("abc");
        for (int i = 0; i <s.size() ; i++) {
            System.out.println(s.get(i));
        }
    }
}
