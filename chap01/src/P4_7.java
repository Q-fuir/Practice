/**
 *  将一个数组中的重复元素保留一个其他的清零。
 */
public class P4_7
{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,1,1,2,3};
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]&&i!=j){
                    a[j]=0;
                }
            }
        }
        for (int i:a) {
            System.out.println("清零后的数组：");
            System.out.println(i);
        }
    }
}
