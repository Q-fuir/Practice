package Test806.JDBCLoginDemo;

import Test806.JDBCTest.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCLogin
{
    public static void main(String[] args)
    {
        //键盘录入用名密码
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();

        boolean flag = new JDBCLogin().login(userName,password);
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }


    }

//    public boolean login (String userName,String password){
//        Connection conn =null;
//        Statement stmt =null;
//        ResultSet rs =null;
//        if(userName==null||password==null){
//            return false;
//        }
//
//        try{
//            conn = JDBCUtils.getConnection();
//
//            String sql ="select * from user where userName= '"+userName+"'and password= '"+password+"'";
//            pst
//            rs=stmt.executeQuery(sql);
//            return rs.next();
//        }catch (SQLException e ){
//            e.printStackTrace();
//        }finally {
//            JDBCUtils.close(rs, stmt, conn);
//        }
//        return false;
//    }



    public  boolean login (String userName,String password){

        //初始化
        Connection conn=null;
        PreparedStatement pst =null;
        ResultSet rs =null;
        //输入用户名或者密码为空
        if(userName==null||password==null){
            return false;
        }
        //查询数据库用户名和密码
        try{
            //获取链接
            conn = JDBCUtils.getConnection();
            //书写sql语句
            StringBuilder sql=new StringBuilder("select * from user where userName=? and password=?");
            pst =conn.prepareStatement(String.valueOf(sql));
            //给占位符赋值
            pst.setString(1,userName);
            pst.setString(2,password);
            //执行查询
            rs=pst.executeQuery();
            return rs.next();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            JDBCUtils.close(rs,pst,conn);
        }

        return false;
    }



}
