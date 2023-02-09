package FinalExercise.Employee_brand2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager extends Employee{

    public Manager(String name, boolean sex, Date birthday, String address, String phone, String email, String identification, String religion, boolean marriage, String id, String department, String role, String englishProficiency, String degree, Date startDay, byte dayOfWork) {
        super(name, sex, birthday, address, phone, email, identification, religion, marriage, id, department, role, englishProficiency, degree, startDay, dayOfWork);
    }

    //Xem bảng lương
    public void viewTableSalary(List<Employee> employeeList){
        for (Employee e : employeeList){
            System.out.println("Name: "+e.getName());
            System.out.println("Salary: "+e.salary());
        }
    }

    //Xem người có mức lương cao nhất
    public void viewHightestSalary(List<Employee> employeeList){
        long hightSalary = employeeList.get(0).salary();
        Employee employeeResult = new Employee();

        for (Employee e:employeeList){
            if (e instanceof Manager)
                continue;
            else {
                if (e.salary() > hightSalary){
                    hightSalary = e.salary();
                    employeeResult = e;
                }
            }
        }
        System.out.println(employeeResult.getName());
        System.out.println(employeeResult.salary());
    }

    
}

