/**
 * 定义printX方法，打印任意行的图形。
 */
public class P_class13
{
    public static  void printX(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
               if(i==j||(i+j)==(n-1)){
                   System.out.print("0");
               }else {
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printX(10);
    }
}
