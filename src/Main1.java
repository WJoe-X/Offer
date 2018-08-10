import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        if (length % 4 != 0) return;
        int row = length / 4 + 1;
        StringBuilder empty = new StringBuilder();
        for (int j = 0; j < row - 2; j++) {
            empty = empty.append(" ");
        }
        for (int i = 0; i < row; i++) {
            if (i == 0)
                System.out.println(s.substring(0, row));
            if (i > 0 && i < row - 1)
                System.out.println(s.substring(length - i, length - i + 1) + empty + s.substring(i + row - 1, i + row));
            if (i == row - 1) {
                for (int m = 0; m < row; m++) {
                    System.out.print(s.substring(length - i - m, length - i - m + 1));
                }
            }
        }
    }
}
