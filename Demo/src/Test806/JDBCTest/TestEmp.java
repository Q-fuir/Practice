package Test806.JDBCTest;

import Test806.JDBCTest.emp.EMP;
import Test806.JDBCTest.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TestEmp
{

    /**
     * 演示JDBCUtils
     */
    public List<EMP> findAllUseJDBCUtils() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<EMP> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            // 定义sql
            String sql = "select * from emp limit 10;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                EMP emp = new EMP();
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
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return list;
    }


    public static void main(String[] args)
    {
        List<EMP> list = new TestEmp().findAllUseJDBCUtils();

        for (EMP emp : list) {
            System.out.println(emp);
        }
    }
}
