package Test805.EMP;

import java.sql.*;

public class JDBCUtil
{


    public Connection getConnection(){
        Connection connection=null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java9","root","root");
        }catch (SQLException e){
            e.printStackTrace();
        }


        return connection;
    }

    public void getClose(Connection connection,Statement statement,ResultSet resultSet){
        try {
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        try {
            if(statement!=null){
                statement.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        try {
            if(resultSet!=null){
                resultSet.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
