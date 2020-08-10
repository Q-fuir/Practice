package Test805.EMP;

import Test805.EMP.domain.EMP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SQLUtil
{
    JDBCUtil jdbcUtil =new JDBCUtil();
    Statement statement=null;
    Connection conn=null;
    ResultSet  rs=null;
    List<EMP> list = new ArrayList<>();

    public List<EMP>  findAll(){
        try{
           conn = jdbcUtil.getConnection();
            String sql = "select * from emp";
            statement = conn.createStatement();
            rs= statement.executeQuery(sql);
            while (rs.next()){
                EMP emp =new EMP();
               emp.setId(rs.getInt("EMPNO"));
               emp.setEname(rs.getString("ENAME"));
               emp.setJob(rs.getString("JOB"));
               emp.setMgr(rs.getInt("MGR"));
               emp.setHiredate(rs.getDate("HIREDATE"));
               emp.setSalary(rs.getInt("SAL"));
               emp.setBonus(rs.getInt("COMM"));
               emp.setDeptno(rs.getInt("DEPTNO"));
               list.add(emp);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            jdbcUtil.getClose(conn,statement,rs);
        }
        return list;
    }
}
