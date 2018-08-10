import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int result = getNumber(n);
        System.out.println(result);
    }
    private static int getNumber(String str) {
        if (str == null || str.length() == 0)
            return 0;
        if (str.length()==1)
            return 0;
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            StringBuilder first = new StringBuilder(str.substring(0, i));
            StringBuilder second = new StringBuilder(str.substring(i, str.length()));
            if (first.charAt(0) != '0' && second.charAt(0) != '0') {
                count++;
                int start = 1;
                int start2 = 1;
                int firstCount = 0;
                int secondCount = 0;
                if (first.length() != 1&&first.charAt(first.length() - 1) != '0' ) {
                   firstCount = first.length()-1;
                }
                if (second.length() != 1&&second.charAt(second.length() - 1) != '0' ) {
                    secondCount = second.length()-1;
                }
                count = count + firstCount * secondCount;
            }else if (first.charAt(0)=='0'&&first.charAt(first.length()-1) !='0'){
                int secondCount = 0;
                if (second.charAt(0) != '0'&&second.length() != 1&&second.charAt(second.length() - 1) != '0' ) {
                    secondCount = second.length()-1;
                }
                if (second.charAt(0)=='0'&&second.charAt(second.length()-1) !='0'){
                    secondCount+=1;
                }
                count +=secondCount;
            }
        }
        return count;
    }
}
