public class P_class1
{
    public static int num(int num1){
        int num=0;
        for (int i=1;i<=num1;i++){
            num+=i;
        }
        return num;
    }

    public static void main(String[] args)
    {
       int sum= num(3);
        System.out.println(sum);
    }
}
