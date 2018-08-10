package TODO;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        if (list == null || list.size() == 0)
            return;
        int count = 0;
        while (list.size() > 0) {
            count++;
            int first = list.get(0);
            int min = 0;
            int max = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > first)
                    max++;
                if (list.get(i) < first)
                    min++;
            }
            if (max > min) {
                for (int i = 0; i < list.size(); i++) {
                    list.remove(0);
                    if (list.get(i) > first)
                        list.remove(i);
                }
            } else {
                for (int i = 0; i < list.size(); i++) {
                    list.remove(0);
                    if (list.get(i) < first)
                        list.remove(i);
                }
            }
        }
        System.out.println(count);
    }


}
