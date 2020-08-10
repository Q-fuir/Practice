package Test803;

public class Computer
{
    public void  OPEN(){
        System.out.println("开机");

    }

    public void  CLOSE(){
        System.out.println("关机");

    }

    public  void usb(USB usb){
        if(usb!=null){
           usb.SHOW();

            if(usb instanceof Mouse){
                Mouse mouse= new Mouse();
                mouse.SHOW();
                mouse.onClick();

            }else if(usb instanceof KeyAround){
                KeyAround k =new KeyAround();
                k.SHOW();
                k.Type();
            }

        }


    }

}
