package com.dao;

import com.connectivity.MySQLConnectionUtility;

import java.sql.*;

public class AddressDAO {
    public String getAddressOfEmployee(int id){
        String sql="select name from address where id in (select address_id from employee where id=" + id +")";
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
        return "exception";
    }
}
