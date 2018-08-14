import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 17:08 2018/8/14
 */
public class Problem62 {

    private Queue<Integer> maxQ= new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

    private Queue<Integer> minQ = new PriorityQueue<>();

    public void Insert(Integer num) {
        maxQ.add(num);
        if(maxQ.size()-minQ.size()>2){
            minQ.add(maxQ.remove());
        }
    }

    public Double GetMedian() {
        if(maxQ ==null &&minQ ==null)
            return null;
        if(maxQ.size() ==minQ.size())
            return Double.valueOf((maxQ.peek()+minQ.peek())/2) ;
        else if(maxQ.size()>minQ.size())
            return Double.valueOf( minQ.peek());
        else return Double.valueOf( minQ.peek());
    }


}
