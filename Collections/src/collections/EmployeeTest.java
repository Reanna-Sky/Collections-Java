package collections;
import java.util.*;
import static collections.Employee.getSomeEmployees;
public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getSomeEmployees();

        // All employees
        for (Employee emp : employees) {
            System.out.printf(emp.getDetails());
        }

        // filtering by department (sales)
        List<Employee> sales = new ArrayList<Employee>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equals("SALES")) {
//                System.out.printf(emp.getDetails());
                sales.add(emp);
            }
        }

        // Under 40 years old
        List<Employee> youths = new ArrayList<Employee>();
        for (Employee emp : employees) {
            if (emp.getAge() < 40) {
//                System.out.printf(emp.getDetails());
                youths.add(emp);
            }
        }
//        combines lists, prints all people in sales and add people from other departments that are under 40
//        It includes duplicates
        sales.addAll(youths);
        for (Employee emp : sales) {
            System.out.printf(emp.getDetails());
        }

//        Removes all people in the youths list
        sales.removeAll(youths);
        for (Employee emp : sales) {
            System.out.printf(emp.getDetails());
        }

        sales.addAll(youths);
        Set<Employee> salesSet = new HashSet<Employee>(sales);
        for (Employee emp : salesSet){
            System.out.printf(emp.getDetails());
        }

//        Order by name
       Collections.sort(employees, new Employee.EmployeeNameComparator());
        for (Employee emp : employees){
            System.out.printf(emp.getDetails());
        }

        //Order by age
        Collections.sort(employees, new Employee.EmployeeAgeComparator());
        for (Employee emp : employees){
            System.out.printf(emp.getDetails());
        }








    }
}
