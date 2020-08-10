package Test724.Computer;

public class Computer
{
    public void run(){
        System.out.println("电脑启动");
    }

    public void shutDown(){
        System.out.println("电脑关机");
    }


    public void useUsb(USB usb){
        if(usb!=null){
            usb.open();
            //进行类型转换
            if(usb instanceof Mouse){
                Mouse mouse = (Mouse)usb;
                mouse.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard keyBoard = (KeyBoard)usb;
                keyBoard.type();
            }
            usb.close();
        }
    }
}
