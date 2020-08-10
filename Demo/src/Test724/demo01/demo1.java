package Test724.demo01;

import java.util.Scanner;

public class demo1
{
    public static void main(String[] args)
    {
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str =scanner.nextLine();
        char[] ch =str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if (ch[i]>='A'&&ch[i]<='Z') {
                bigCount++;
            }else if(ch[i]>='a'&&ch[i]<='z'){
                smallCount++;
            }else if(ch[i]>='0'&&ch[i]<='9'){
                numberCount++;
            }else {
            }
        }
        System.out.println("大写字符数"+ bigCount);
        System.out.println("小写字符数"+ smallCount);
        System.out.println("数字字符数"+ numberCount);

;    }
}
