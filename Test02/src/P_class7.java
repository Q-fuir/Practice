import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class P_class7
{
    public static void main(String[] args)
    {
        Scanner san = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=san.nextInt();
        System.out.println("请输入第二个数");
        int b=san.nextInt();
        System.out.println("请输入第三个数");
        int c=san.nextInt();
        int x=a>b?a:b;
        int y=x>c?x:c;
        System.out.println("最大数是："+y+"  "+"较大的是"+x);


    }
}
