import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class test
{
    public static void main(String[] args)
    {
//       int a[]={44,0,2,4,6};
//        Arrays.sort(a);
//       for (int i:a) {
//           System.out.println(i);
//        }

        //课后练习 2020.7.17
//        for(int i=100;i<1000;i++){
//            int a =i%10;//个位数
//            int b = i/10%10;//十位数
//            int c=i/100;//百位数
//
//            if(a*a*a+b*b*b+c*c*c==i){
//                System.out.println("水仙花数是");
//                    System.out.println(i);
//            }

//            for(int i =1; i<=9;i++){
//                for(int j=1;j<=i;j++){
//                    System.out.print(j+"*"+i+"="+i*j);
//                    System.out.print(" ");
//                }
//                System.out.println(" ");
//        }

//        int n=23;
//        boolean flag = true;
//        for(int i=2;i<n;i++) {
//
//            if (n % i == 0) {
//                flag = false;
//                System.out.println(i);
//                break;
//            }
//        }
//            if(flag){
//                System.out.println(n+"是素数");
//            }else {
//                System.out.println(n+"不是素数");
//            }
//
               // 2020.7.18练习
        int [][]arr={
                {2,3,4},
                {4,6,8}
        };
        int [][] brr={
                 {1,5,2,8},
                 {5,9,10,-3},
                 {2,7,-5,-18}
        };
        int [][]crr=new int [arr.length][4];
        for (int i =0;i<arr.length;i++){
            for(int j=0;j<4;j++){
                for(int k =0;k<arr[i].length;k++){
                    crr[i][j]+=arr[i][k]*brr[k][j];
                    System.out.println(brr[k][j]);
                }
            }
        }

        for (int i=0;i<crr.length;i++){
            for(int j=0;j<crr[i].length;j++){

                System.out.print(crr[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
