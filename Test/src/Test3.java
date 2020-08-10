/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 *    分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
public class Test3
{
    public static void main(String[] args)
    {
        int x,y,z;
        for ( x=1;x<5;x++){
            for( y=1;y<5;y++){
                for( z=1;z<5;z++){
                    if(x!=y&&x!=z&&y!=z){
                        System.out.println(x+""+y+""+z);
                    }
                }
            }
        }

    }
}
