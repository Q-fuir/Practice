package Test723.demo03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Manager manager=new Manager("群主",200);
        Member m1=new Member("B",0);
        Member m2 =new Member("C",0);
        manager.showMessage();
        m1.showMessage();
        m2.showMessage();
        System.out.println("请输入金额");
        Scanner scanner = new Scanner(System.in);
        int money =scanner.nextInt();
        System.out.println("请输入发几个红包");
        int n= scanner.nextInt();
        ArrayList<Integer> arrayList =manager.sendMoney(money,n);
        m1.getMoney(arrayList);
        m2.getMoney(arrayList);
        manager.showMessage();
        m1.showMessage();
        m2.showMessage();



    }
}
