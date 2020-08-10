public class Test02
{
    public static void main(String[] args)
    {
        int[] sort = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };
        for(int i = 0;i<sort.length;i++){
            for(int j=i;j<sort.length;j++){
                if(sort[j]>sort[i]){
                    int temp;
                    temp= sort[i];
                    sort[i]=sort[j];
                    sort[j]=temp;

                }
            }
        }
        for (int i:sort) {
            System.out.println(i);
        }
    }

}
