/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:46 2018/8/14
 */
public class Problem66 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean [] boo = new boolean[matrix.length];
        if( matrix.length==0 ||matrix.length<str.length)
            return false;
        for(int i =0 ;i<rows;i++){
            for(int j = 0; j<cols ;j++){
                if(getPath(matrix,rows,cols,str,0,i,j,boo))
                    return true;
            }
        }
        return false;
    }

    private boolean getPath(char[] matrix, int rows, int  cols , char[] str ,int k,int i, int j , boolean[] boo){
        int index = i*cols+j;
        if(i<0||i>=rows||j<0||j>=cols||boo[index]|| matrix[index] != str[k])
            return false;
        if(k == str.length-1)
            return true;
        boo[index] =true;
        if( getPath(matrix,rows,cols,str,k+1,i-1,j,boo)||
                getPath(matrix,rows,cols,str,k+1,i+1,j,boo)||
                getPath(matrix,rows,cols,str,k+1,i,j-1,boo)||
                getPath(matrix,rows,cols,str,k+1,i,j+1,boo))
            return true;
        boo[index] = false;
        return false;
    }
}
