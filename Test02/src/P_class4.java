public class P_class4
{
    public static  String   toString(int []arr){
        String str ="[" ;

            for ( int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                    str+=arr[i]+"]";
                }else {

                    str += arr[i] + "," + " ";
                }
            }

        return str;
    }

    public static void main(String[] args)
    {
        int[] arr={1,6,8,9};
        System.out.println( toString(arr));
    }
}
