/**
 * @auther: WJoe
 * @Description: 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Date : 10:51 2018/7/30
 */
public class Problem1 {

    public boolean Find(int target, int [][] array) {
        if(array == null || array.length ==0){
            return false;
        }
        int rows= array.length;
        int columns = array[0].length;
        int i = 0;
        int j = columns-1;
        while(i<rows&& 0<=j){
            if(array[i][j]==target){
                return true;
            }
            else if(array[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
