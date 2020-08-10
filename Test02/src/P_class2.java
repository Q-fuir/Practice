public class P_class2
{
    public static  int arrayMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int []brr={1,2,5,6};
        System.out.println("最大元素是："+arrayMax(brr));
    }
}
