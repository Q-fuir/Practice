package Test724.AfterPractice.P_3;

public interface A
{
    public abstract void showA();

    public static void showB10(){
        System.out.println("static BBBB");
        show10("B10");
    }

    public static void showC10(){
        System.out.println("static CCCC");
        show10("C10");
    }

    private  static void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.print(str+" ");
        }
        System.out.println();
    }


}
