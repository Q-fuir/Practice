package Test725.demo01;

public class Person
{
    private  boolean live =true;

    class Heart{
        public void Heart(){
                if(live){
                    System.out.println("还有气");
                }else {
                    System.out.println("嗝屁");
                }
        }
    }

    public boolean isLive()
    {
        return live;
    }

    public void setLive(boolean live)
    {
        this.live = live;
    }
}
