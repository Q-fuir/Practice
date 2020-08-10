package Test804.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUtils
{
    public static void main(String[] args) throws Exception
    {
        //以下代码在mysql5.5版本之下可以省略
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9", "root", "root");
//        4、定义sql
        String sql = "update account set balance= 20000 where id = 1";
//        5、获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
//        6、执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);// 返回受影响的行数
//        7、处理结果
        System.out.println(count);
//        8、释放资源
        stmt.close();
        conn.close();
    }

}
