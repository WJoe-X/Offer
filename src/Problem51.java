/**
 * @auther: WJoe
 * @Description: 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @Date : 21:24 2018/8/6
 */
public class Problem51 {
    //分两步：1.计算前i - 1个元素的乘积，及后N - i个元素的乘积        规划实现。
    //        2.计算B[i]的值。
    //下三角用连乘可以很容求得，上三角，从下向上也是连乘。
    //因此我们的思路就很清晰了，先算下三角中的连乘，
    // 即我们先算出B[i]中的一部分，然后倒过来按上三角中的分布规律，把另一部分也乘进去。
    public int[] multiply(int[] A) {
          if (A ==null ||A.length == 0)
              return null;
          int [] B = new int[A.length];
         B[0]=1;
        for (int i = 1; i <A.length ; i++) {
            B[i] = B[i-1]*A[i-1];
        }
        int temp =1;
        for (int i = A.length-2; i >=0 ; i--) {
            temp *= A[i+1];
            B[i] *=temp;
        }
        return B;

    }

}
