/**
 * @auther: WJoe
 * @Description: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *  请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @Date : 16:58 2018/7/30
 */
public class Problem10 {

    public int RectCover(int target) {
        if (target<=0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if (target ==2){
            return 2;
        }
        int result = 0;
        int n1 = 1;
        int n2 =2;
        for (int i = 3; i <=target ; i++) {
            result = n1+n2;
            n1 =n2;
            n2 = result;
        }
        return  result;
    }
}
