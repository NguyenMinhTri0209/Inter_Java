package FinalExercise.Employee_brand2;

import java.util.List;

public class Accountant extends Employee{

    public Accountant(String name, boolean sex, Date birthday, String address, String phone, String email, String identification, String religion, boolean marriage, String id, String department, String role, String englishProficiency, String degree, Date startDay, byte dayOfWork) {
        super(name, sex, birthday, address, phone, email, identification, religion, marriage, id, department, role, englishProficiency, degree, startDay, dayOfWork);
    }

    //Xem bảng lương
    public void viewTableSalary(List<Employee> employeeList){
        for (Employee e : employeeList){
            System.out.println("Name: "+e.getName());
            System.out.println("Salary: "+e.salary());
        }
    }
}
