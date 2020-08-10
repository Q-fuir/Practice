package Test805;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils2
{
    public static void main(String[] args) throws Exception
    {
        //以下代码在mysql5.5版本之下可以省略


        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
//        4、定义sql
//        String sql = "insert into account values(3,'大麻子','2000')";//添加
//        String sql = "delete from account where id=2";//删除
        String sql = "select * from account";
//        5、获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
//        6、执行sql，接受返回结果
        ResultSet res  = stmt.executeQuery(sql);// 返回受影响的行数
      while (res.next()) {
          int id = res.getInt(1);
          String name = res.getString("name");
          int balance = res.getInt(3);
          System.out.println(id + name + balance);
      }
//        7、处理结果
//        if(row>0){
//            System.out.println("添加成功");
//            System.out.println(res);
//        }else {
//            System.out.println("添加失败");
//        }
//        8、释放资源
        stmt.close();
        conn.close();
        res.close();
    }

}
