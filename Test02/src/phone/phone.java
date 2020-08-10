package phone;

public class phone
{
   private String brand;
   private int price;
   private String color;

  public phone(){}

    public  phone(String brand,int price,String color){
       this.brand=brand;
       this.price=price;
       this.color=color;
   }


    public String getBrand(){
        return brand;
    }

    public  void setBrand(String brand1){
        brand=brand1;
    }

    public String getColor(){
        return color;
    }

    public  void  setColor(String color1){
        color=color1;
    }

    public  int getPrice(){
        return price;
    }

    public void setPrice(int price1){
        price=price1;
    }


    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void  SendMessage(){
        System.out.println("以群发消息");
    }
}
