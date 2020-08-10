package Test806.studentAdmin.dao.Impl;



import Test806.studentAdmin.domain.Student;
import Test806.studentAdmin.dao.StudentDao;
import Test806.studentAdmin.utils.JDBCUtils;
import org.springframework.jdbc.object.SqlCall;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao
{

    @Override
    public List<Student> findAll()
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Student> arrayList = new ArrayList<>();
        try{
            //获取链接
            conn = JDBCUtils.getConnection();
            //书写sql
            String sql = "select * from studentmanage";
            stmt=conn.prepareStatement(sql);
            rs= stmt.executeQuery();
            //查询结果集
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setScore(rs.getInt("score"));
                student.setAddr(rs.getString("addr"));
                student.setTel(rs.getString("tel"));
                arrayList.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn,rs);
        }
        return arrayList;
    }


    @Override
    public boolean save(Student student)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            //获取链接
            conn=JDBCUtils.getConnection();
            //书写sql
            String sql = "insert into studentmanage values(null,?,?,?,?,?);";
            stmt=conn.prepareStatement(sql);
            //给占位符赋值
            stmt.setString(1,student.getName());
            stmt.setString(2,student.getGender());
            stmt.setInt(3,student.getScore());
            stmt.setString(4,student.getAddr());
            stmt.setString(5,student.getTel());
            int row= stmt.executeUpdate();
            if(row>0){
                //添加成功
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn, null);
        }
        return false;
    }

    @Override
    public boolean remove(Integer id)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //获取链接
            conn =JDBCUtils.getConnection();
            //书写sql
            String sql="delete from studentmanage where id=?";
            stmt=conn.prepareStatement(sql);
            //给占位符赋值
            stmt.setInt(1,id);
             int row=stmt.executeUpdate();
            if(row>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn,null);
        }
        return false;
    }

    @Override
    public boolean update(Student student)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            //获取链接
            conn =JDBCUtils.getConnection();
            //书写sql
            String sql="update studentmanage set score=? where id=?";
            stmt=conn.prepareStatement(sql);
            //给占位符赋值
            stmt.setInt(1,student.getScore());
            stmt.setInt(2,student.getId());
             int row=stmt.executeUpdate();
             if(row>0){
                 return true;
             }
        }catch (SQLException e){
           e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn,null);
        }
        return false;
    }


}
