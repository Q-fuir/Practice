package Exercise722;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCar
{
    public static void main(String[] args)
    {
        ArrayList<SUV> arrayList= new ArrayList<>();
        SUV s1=new SUV();
        SUV s2=new SUV();
        SUV s3=new SUV();
        s1.brand="SUV";
        s1.price=760000;
        s1.length=4813;
        s2.brand="SUV";
        s2.price=188800;
        s2.length=4545;
        s3.brand="SUV";
        s3.price=155555;
        s3.length=4000;
        s3.brand="奥迪";
        s3.price=122222;
        s3.length=35000;
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);



        for (int i = 0; i <arrayList.size() ; i++) {
            SUV suv =arrayList.get(i);
            suv.judgeLength(suv.getLength());

        }








    }
}
