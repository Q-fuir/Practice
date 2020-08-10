package Test806.JDBCDemoSql;

import Test806.JDBCTest.utils.JDBCUtils;

import javax.management.MBeanAttributeInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemoSQL
{
    public static void main(String[] args)
    {
        Connection conn=null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        PreparedStatement pst2 = null;
        try{
            conn= JDBCUtils.getConnection();
            String sql ="update account set balance = balance-? where id= ?";
            String sql2 ="update account set balance = balance+? where id= ?";

            pst=conn.prepareStatement(sql);
            pst2=conn.prepareStatement(sql2);

            pst.setInt(1,500);
            pst.setInt(2,1);

            pst2.setInt(1,500);
            pst2.setInt(2,2);

            int count=pst.executeUpdate();

            //手动制造异常
            int i=5/0;
            int count2=pst2.executeUpdate();

           System.out.println("count="+count+" "+"count2="+count2);
        }catch (Exception e){
            //事务回滚
            try{
                if(conn!=null){
                    conn.rollback();
                }
            }catch (SQLException e1){
                e1.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pst,conn);
            JDBCUtils.close(null,pst2,conn);

        }
    }
}
