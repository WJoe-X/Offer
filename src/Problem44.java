import java.util.ArrayList;
import java.util.Stack;

/**
 * @auther: WJoe
 * @Description: 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * @Date : 19:41 2018/8/4
 */
public class Problem44 {

    public String ReverseSentence(String str) {
      if (str ==null ||str.length()==0)
          return "";
      if ("".equals(str.trim()))
          return str;
      String[] strings  = str.split(" ");
      int start = 0;
        Stack<Integer> stack =new Stack<>();
                ArrayList<Integer> list = new ArrayList<>();
      int end = strings.length-1;
      while (start<end){
          String temp = strings[start];
          strings[start] =strings[end];
          strings[end] = temp;
          start++;
          end--;
      }
     StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <strings.length ; i++) {
            stringBuilder.append(strings[i]);
            if (i !=strings.length-1)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

}
