import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

}
