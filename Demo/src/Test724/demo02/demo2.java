package Test724.demo02;



public class demo2
{
    public static void main(String[] args)
    {
        System.out.println(Math.abs(-5));

        //计算-10.8到5.9之间，绝对值大于6小于2.1的整数
        double min =-10.8;
        double max=5.9;
        int count =0;
        for(double i=Math.ceil(min);i<=Math.floor(max);i++){
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("个数是："+count);
    }
}
