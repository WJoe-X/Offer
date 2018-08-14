import java.util.Scanner;
public class Wangyi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] course = new int[n];
        int[] sleep = new int[n];
        for (int i = 0; i < n; i++) {
            course[i] = scanner.nextInt();
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sp= scanner.nextInt();
            if (sp>0){
                sum +=course[i];
                course[i] =0;
            }
            sleep[i] =course[i];
            if (i!=0)
                sleep[i] +=sleep[i-1];

            sp = sleep[i];
            if (i-k>0)
                sp -=sleep[i-k];
            if (sp>max)
                max= sp;
        }
        System.out.println(max);
    }
}
