package com.dao;

import com.connectivity.MySQLConnectionUtility;
import model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getListOfEmployee() {
        List<Employee> EmployeeList = new ArrayList<>();
        Connection connection = MySQLConnectionUtility.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Employee");
            while(resultSet.next()) {

                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                int depId=resultSet.getInt("DEP_ID");
                int addressID=resultSet.getInt("ADDRESS_ID");

                EmployeeList.add(new Employee(id, name,depId,addressID));
            }
        } catch (SQLException e) {
            System.out.println("Exception found");
        }
        return EmployeeList;
    }
    public void addEmployee(Employee employee){
        Connection connection = MySQLConnectionUtility.getConnection();
        String sql = "insert into Employee values(?,?,?,?)";
        try{
            PreparedStatement ps =connection.prepareStatement(sql);
            ps.setInt(1,employee.getId());
            ps.setString(2,employee.getName());
            ps.setInt(3,employee.getDepId());
            ps.setInt(4,employee.getAddressId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Exception found");
        }
        }
    public void updateEmployee(Employee employee){
        Connection connection = MySQLConnectionUtility.getConnection();
        String sql = "update employee set name=?,dep_id=?,address_id=? where id=?";
        try{
            PreparedStatement ps =connection.prepareStatement(sql);
            ps.setString(1,employee.getName());
            ps.setInt(2,employee.getDepId());
            ps.setInt(3,employee.getAddressId());
            ps.setInt(4,employee.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Exception found");
        }
    }
    public void deleteEmployee(int id){
        Connection connection = MySQLConnectionUtility.getConnection();
        String sql = "DELETE FROM Employee WHERE id=?";
        try{
            PreparedStatement ps =connection.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Exception found");
        }
    }
 }


