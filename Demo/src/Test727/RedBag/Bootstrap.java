package Test727.RedBag;

/**
 * 红包界面启动程序
 */
public class Bootstrap
{
    public static void main(String[] args)
    {
        //设置标题
        MyRed myRed = new MyRed("红包");
        //设置群主名

        myRed.setOwnerName("海洋");

        //设置分发策略
        //普通红包
//        NormalMode normalMode = new NormalMode();
//        myRed.setOpenWay(normalMode);

        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);

    }

}
