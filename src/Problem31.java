/**
 * @auther: WJoe
 * @Description: 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * @Date : 21:48 2018/8/1
 */
public class Problem31 {

    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int count = 0;
        int i = 1;
        int upper = 0;
        int current = 0;
        int low = 0;
        while (n / i > 0) {
            upper = n / (i * 10); //高位
            current = (n / i) % 10;
            low = n % (i*10);
            if (current==0){
                count += upper*i;
            }
            else if (current==1){
                count += upper*i +low+1;
            }else count += upper*(i+1);
        }
        return  count;
    }

}
