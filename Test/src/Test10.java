/**
 * 10. 打印出杨辉三角形（要求打印出10行如下图）
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10   10   5   1
 */
public class Test10
{
    public static void main(String[] args)
    {
        int [][]arr=new int[10][10];

        for(int i=0;i<10;i++){
            arr[i][0]=1;
            System.out.print(arr[i][0]+"\t");
            for(int j=1;j<=i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }




    }
}
