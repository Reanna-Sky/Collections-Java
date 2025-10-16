package collections;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class EmployeeTestLambda {

    public static void main(String[] args) {
        Stream<Employee> employees = Employee.getSomeEmployees().stream();

//        employees
//                .filter(e -> e.getAge() < 35)
////                .forEach(e -> System.out.printf(e.getDetails()));
//                .map(Employee :: getFullname)
//                .forEach(System.out :: println);

//        employees
//                .map(Employee :: getDepartment)
//                .distinct()
//                .forEach(System.out::println);


        employees
                .collect(groupingBy(Employee :: getDepartment))
                .forEach((department, emp) ->System.out.printf("%-15s%d\n", department, emp.size() ));
























    }

}
