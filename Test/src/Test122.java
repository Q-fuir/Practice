public class Test122
{
    public static void main(String[] args)
    {
        double fz = 2.0;
        double fm =1.0;
        double sum=0.0;
        for(int i=1;i<=20;i++){
            sum= sum+(fz/fm);
            double temp =fz;
            fz=fz+fm;
            fm=temp;
        }
        System.out.println(sum);

    }
}
