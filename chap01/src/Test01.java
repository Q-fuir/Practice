/**
 * 假设队列中共有500人，每次从1开始数，数到3的人出队，下一个人接着从1开始数，编写程序找到最后剩下的人是哪一个。
 */

public class Test01
{
    public static void main(String[] args)
    {
        boolean[] num = new boolean[500];
        for(int i=0;i<num.length;i++){
            num[i]=true;
        }
        int num1= num.length;
        int cont=0;
        int index=0;
        while(num1>1){
            index++;
            if(index==num.length){
                index=0;
            }
            if(num[index]==true){
                cont++;
                if(cont%3==0){
                    cont=0;
                    num[index]=false;
                    num1--;
                }
            }
        }
        for(int i=0;i<num.length;i++){
                    if(num[i]==true){
                        System.out.println(i);
                        break;
                    }
        }



    }
}
