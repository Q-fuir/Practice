/**
 * 定义showColor方法，根据英文单词，输出对应的颜色。
 *红色、red, 黄色、yellow, 绿色、green, 蓝色、blue,
 * 粉色、pink, 棕色、brown, 紫色purple 黑是black, 白是white ”
 * 代码实现，效果如图所示
 */
public class P_class11
{
    public static void main(String[] args)
    {
        showColor("pink");

    }

    public static  void showColor(String color){
        switch (color){
            case "red":
                System.out.println("red是：红色");
                break;
            case "white":
                System.out.println("white是：白色");
                break;
            case "yellow":
                System.out.println("yellow是：黄色");
                break;
            case "blue":
                System.out.println("blue是：蓝色");
                break;
            case "green":
                System.out.println("green是：绿色");
                break;
            case "pink":
                System.out.println("pink是：粉色");
                break;
            case "brown":
                System.out.println("brown是：棕色");
                break;
            case "purple":
                System.out.println("purple是：紫色");
                break;
            default :
                System.out.println("black是：黑色");
                break;
        }

    }
}
