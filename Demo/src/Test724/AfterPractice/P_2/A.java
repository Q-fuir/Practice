package Test724.AfterPractice.P_2;

public interface A
{
    public  abstract  void showA();

    public  default  void showB10(){
        System.out.println("BBBB");
        show10("B10");
    }

    public  default  void showC10(){
        System.out.println("CCCC");
        show10("C20");
    }

    private void show10(String string){
        for (int i = 0; i <10 ; i++) {
            System.out.println(string+"");
        }
        System.out.println();
    }
}
