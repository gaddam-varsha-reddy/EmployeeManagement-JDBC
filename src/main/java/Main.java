import com.dao.AddressDAO;
import com.dao.DepartmentDAO;
import com.dao.EmployeeDAO;
import model.Address;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.Add Employee");
        System.out.println("2.Update Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.List all Employees");
        System.out.println("5.Get Department of Employee");
        System.out.println("6.Get Address of Employee");
        System.out.println("7.Exit");
        System.out.println("Enter n value");
        Scanner sc=new Scanner(System.in);
        // StudioDAO studioDAO = new StudioDAO();
        EmployeeDAO employeeDAO=new EmployeeDAO();
        int n=sc.nextInt();
        while(n!=7){
        switch (n) {
            case 1:
                //System.out.println("In add employee");
                System.out.println("Enter employee id");
                int id=sc.nextInt();
                System.out.println("Enter employee name");
                String name=sc.next();
                System.out.println("Enter employee department Id");
                int depId=sc.nextInt();
                System.out.println("Enter employee address Id");
                int addressId=sc.nextInt();
                employeeDAO.addEmployee(new Employee(id,name,depId,addressId));
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 2:
                //System.out.println("In update employee");
                System.out.println("Enter employee id");
                id=sc.nextInt();
                System.out.println("Enter updated employee name");
                name=sc.next();
                System.out.println("Enter updated employee department Id");
                depId=sc.nextInt();
                System.out.println("Enter updated employee Address Id");
                addressId=sc.nextInt();
                employeeDAO.updateEmployee(new Employee(id,name,depId,addressId));
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 3:
                //System.out.println("In delete employee");
                System.out.println("Enter employee Id whose record you want to delete");
                id=sc.nextInt();
                employeeDAO.deleteEmployee(id);
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 4:
                //System.out.println("In list employee");
                List<Employee> listOfEmployee = employeeDAO.getListOfEmployee();
                if(listOfEmployee != null) {
                    for (Employee employee : listOfEmployee) {
                        System.out.println(employee.getId() +" "+employee.getName()+ " " +employee.getDepId()+" "+ employee.getAddressId());
                    }
                }
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 5:
                //System.out.println("In getting department of employee");
                System.out.println("Enter Employee Id");
                id=sc.nextInt();
                DepartmentDAO departmentDAO=new DepartmentDAO();
                String depName= departmentDAO.getDepartmentNameOfEmployee(id);
                System.out.println("Employee id: "+ id);
                System.out.println("Department Name: "+depName);
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 6:
                //System.out.println("In getting address of employee");
                System.out.println("Enter Employee Id");
                id=sc.nextInt();
                AddressDAO addressDAO=new AddressDAO();
                String address=addressDAO.getAddressOfEmployee(id);
                System.out.println(address);
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            default:
                System.out.println("Enter valid number");
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
        }

        }

    }
}
