import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt())
                list.add(scanner.nextInt());
            lists.add(list);
        }
        System.out.println(getClosedF(n,lists));
    }
    private static int getClosedF(int n, List<List<Integer>> lists) {
        if (lists==null||n > lists.size()||n<0)
            return -1;
        List<Integer> list = lists.get(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> ll = lists.get(i);
            for (int j = 0; j < ll.size(); j++) {
                if (ll.get(j) != n) {
                    if (!map.containsKey(ll.get(j)))
                        map.put(ll.get(j), 1);
                    else map.put(ll.get(j), map.get(ll.get(j)) + 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if (entry.getValue()>max){
                 max =entry.getValue();
                 index = entry.getKey();
             }
        }
        return index;
    }

}
