package Practice817;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeeCodeFace02 {

    /**
     *判定是否互为字符重排
     * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     * @param s1
     * @param s2
     * @return
     */

    //方式一
//    public boolean CheckPermutation(String s1, String s2){
//
//        if(s1.length()!=s2.length()){
//            return false;
//        }
//
//        char[] arr1=s1.toCharArray();
//        char[] arr2=s2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//       return Arrays.equals(arr1,arr2);
//    }

    //方式二(JavaScript)
    //var CheckPermutation = function(s1, s2) {
        //       return s1.split('').sort().toString()===s2.split('').sort().toString();
        //   };
        //
        // var flag =CheckPermutation("abc","bcb");
        // document.write(flag)

    //方式三
    public boolean CheckPermutation(String s1, String s2){
        Map<Character,Integer> map = new HashMap<>();

        int temp=0;
        for (int i = 0; i <s1.length(); i++) {
                if(map.containsKey(s1.charAt(i))){
                    map.put(s1.charAt(i),i);
                }else {
                    map.put(s1.charAt(i),1);
                }


        }
        return true;
    }



    public static void main(String[] args) {
        boolean flag =new LeeCodeFace02().CheckPermutation("abc","acb");
        System.out.println(flag);
    }
}
