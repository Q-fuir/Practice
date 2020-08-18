package Practice817;

public class LeeCodeFace01 {
    /**
     * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
     */

    public static void main(String[] args) {
            boolean flag=new LeeCodeFace01().isUnique("leeCode");
        System.out.println(flag);

    }


    public boolean isUnique(String str){
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                        return false;
                }
            }
        }
        return true;
    }
}
