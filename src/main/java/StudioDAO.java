import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class StudioDAO {
    public List<Student> getListOfStudents() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = MySQLConnectionUtility.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM department");
            while(resultSet.next()) {

                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");

                studentList.add(new Student(id, name));
            }
        } catch (SQLException e) {
            System.out.println("Exception found");
        }
        return studentList;
    }

    public void createStudent() {
        //TDOO
    }
}
