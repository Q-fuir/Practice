package Practice818;

import java.util.Arrays;

public class LeeCodeFace03 {

    /**
     * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
     * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
     *
     */

//
//    public String replaceSpaces(String S, int length) {
//
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i <length ; i++) {
//            if(S.charAt(i)==' '){
//                sb.append("%20");
//            }else{
//                sb.append(S.charAt(i));
//            }
//        }
//            String str = sb.toString();
//        return  str;
//    }


    public String replaceSpaces(String S, int length) {
        char[] arr=new char[S.length()];
        int j=0;
        for (int i = 0; i <length ; i++) {
            if(S.charAt(i)==' '){
               arr[j++]='%';
               arr[j++]='2';
               arr[j++]='0';
            }else {
                arr[j++]=S.charAt(i);
            }
        }
        String str= String.valueOf(arr);

        return str;
    }

    public static void main(String[] args) {
        String str = new LeeCodeFace03().replaceSpaces("Mr John Smith    ", 13);
        System.out.println(str);


    }
}
