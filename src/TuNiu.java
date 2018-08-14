import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 14:36 2018/8/14
 */
public class TuNiu {

    private Queue<Integer> queue= new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    });
    public static synchronized void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    hello();
                }
            };
            t.start();
            try {
                Thread.sleep(new Random().nextInt(500));
            } catch (InterruptedException e) {
            }
            System.out.print("There");
        }

    }

    static synchronized void hello() {
        try {
            Thread.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {

        }
        System.out.print("Hello");
    }
}
