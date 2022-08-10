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
        //private StudioDAO studioDAO = new StudioDAO();
        EmployeeDAO obj=new EmployeeDAO();
        int n=sc.nextInt();
        while(n!=7){
        switch (n) {
            case 1:
                System.out.println("In add employee");
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 2:
                System.out.println("In update employee");
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 3:
                System.out.println("In delete employee");
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 4:
                System.out.println("In list employee");
                List<Employee> listOfEmployee = obj.getListOfEmployee();
                if(listOfEmployee != null) {
                    for (Employee employee : listOfEmployee) {
                        System.out.println(employee.getId() +" "+employee.getName()+ " " +employee.getDepId()+" "+ employee.getAddressId());
                    }
                }
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 5:
                System.out.println("In getting department of employee");
                System.out.println("Enter n value");
                n=sc.nextInt();
                break;
            case 6:
                System.out.println("In getting address of employee");
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
