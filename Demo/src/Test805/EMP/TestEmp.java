package Test805.EMP;

import Test805.EMP.domain.EMP;

import java.util.List;

public class TestEmp
{
    public static void main(String[] args)
    {
        SQLUtil sqlUtil =new SQLUtil();
        List<EMP> list = sqlUtil.findAll();
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }


    }
}
