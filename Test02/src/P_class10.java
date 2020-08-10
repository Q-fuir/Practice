/**
 * 定义类 Test2,类中定义 main方法
 * 定义doCheck方法,参数为(int iVar),返回值boolean类型
 * doCheck方法内,定义变量boolean flag.
 * doCheck方法内,判断num是否为偶数.
 * 如果是偶数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
 * 循环内,num-=i;
 * flag赋值为true.
 * 否则是奇数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
 * 循环内,num+=i;
 * flag赋值为false.
 * 输出num的值
 * 返回flag
 * 调用doCheck方法,传入2,保存返回值,并输出
 * 调用doCheck方法,传入3,保存返回值,并输出
 */
public class P_class10
{
    public static  boolean doCheck(int iVar){
        boolean flag;
        int num=iVar;
        if(num%2==0){
            for (int i = 0; i <=20 ; i++) {
                num-=i;
            }
            System.out.println("num="+num);
            flag=true;
        }else {
            for (int i = 0; i <=20 ; i++) {
                num+=i;
            }
            System.out.println("num="+num);
            flag=false;
        }

        return flag;
    }

    public static void main(String[] args)
    {
        System.out.println(doCheck(2));
        System.out.println(doCheck(3));
    }
}
