/**
 * 分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。
 */

public class P3_11
{

    public static void FFor(){
        int sum=0;
        //for循环
        for (int i=1;i<=100;i++){
            if(i%3==0){
                sum+=i;
            }
        }
        System.out.println("能被3整除的整数的和"+sum);
    }

    public static void WHILE(){
        int sum=0;
        //while循环
        int i=1;
        while ( i<=100){
            if(i%3==0)
                sum+=i;
            i++;

        }
        System.out.println("能被3整除的整数的和"+sum);
    }


    public static void Do(){
        int sum=0;
        int i=1;
        //do循环
        do {
            if(i%3==0)
                sum+=i;
            i++;

        }while(i<=100);
        System.out.println("能被3整除的整数的和"+sum);

    }
    public static void main(String[] args)
    {
        FFor();
        Do();
        WHILE();

    }

}
