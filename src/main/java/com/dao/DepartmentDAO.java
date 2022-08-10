package com.dao;

import com.connectivity.MySQLConnectionUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDAO {
    public String getDepartmentNameOfEmployee(int id){
        String sql="select name from department where id in (select dep_id from employee where id= " +id+")";
        Connection connection = MySQLConnectionUtility.getConnection();
        try {
            //PreparedStatement ps =connection.prepareStatement(sql);
            //ps.setInt(1,id);
            //ps.execute();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String name = resultSet.getString("NAME");
                return name;
            }
        }
        catch (SQLException e) {
            System.out.println("Exception found");
        }
        return "Exception";
    }
}
