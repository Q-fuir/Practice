package Test730.myGeneric;

public class MyGenericMethod
{
    public <MVP>void  show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public  <MVP> MVP SHOW  (MVP mvp){
        return  mvp;
    }
}
