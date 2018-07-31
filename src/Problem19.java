import java.util.ArrayList;

/**
 * @auther: WJoe
 * @Description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1 2  3  4
 * 5 6  7   8
 * 9 10 11 12
 * 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @Date : 15:04 2018/7/31
 */
public class Problem19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return result;

        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        while (rows > start * 2 && columns > start * 2) {
            printMatrixInCircle(matrix, rows, columns, start, result);
            start++;
        }
        return result;
    }

    private void printMatrixInCircle(int[][] maxtrix, int rows, int columns, int start, ArrayList<Integer> result) {
        int endY = columns - start-1;
        int endX = rows - start-1;

        for (int i = start; i <=endY; i++) {
            result.add(maxtrix[start][i]);
        }
        if (endX > start) {
            for (int i = start + 1; i <= endX; i++) {
                result.add(maxtrix[i][endY]);
            }
        }
        if (endY > start && endX > start) {
            for (int i = endY - 1; i >= start; i--) {
                result.add(maxtrix[endX][i]);
            }
        }
        if (start < endY && start < endX - 1) {
            for (int i = endX-1 ; i >= start + 1; i--)
                result.add(maxtrix[i][start]);
        }

    }

    public static void main(String[] args) {
        int[][] maxtrix = new int[][]{{1,2},{3,4}};

        Problem19 problem19 = new Problem19();
        ArrayList<Integer> arrayList = problem19.printMatrix(maxtrix);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
