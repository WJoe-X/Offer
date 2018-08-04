import java.util.ArrayList;

/**
 * @auther: WJoe
 * @Description: 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @Date : 15:11 2018/8/2
 */
public class Problem33 {

    public int GetUglyNumber_Solution(int index) {
        if (index<=0)
            return 0;
       if (index<7)
           return index;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int n2=0;
        int n3= 0;
        int n5=0;
   while (list.size()<index){
       int num2 = list.get(n2)*2;
       int num3 = list.get(n3)*3;
       int num5 = list.get(n5)*5;
      int newNumbers =  Math.min(num2,Math.min(num3,num5));
       list.add(newNumbers);
       if (num2 == newNumbers) n2++;
       if (num3 == newNumbers) n3++;
       if (num5 == newNumbers) n5++;
   }
   return  list.get(index-1);
    }

    public static void main(String[] args) {
        Problem33 problem33 = new Problem33();

        problem33.GetUglyNumber_Solution(10);
    }
}
