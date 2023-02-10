package FinalExercise.Employee_brand3.model;

import java.util.List;

public class Accountant extends Employee{

    //region constructor
    public Accountant(String id, String name, byte working_hours, long out_time) {
        super(id, name, working_hours, out_time);
    }

    public Accountant() {
    }

    //endregion

    @Override
    public long calculate_salary() {
        return super.calculate_salary();
    }

    //view salary table
    void viewSalaryTable(List<Employee> employeeList){
        System.out.println("==================SALARY TABLE==================");
        for (Employee e : employeeList){
            System.out.println("Name: "+e.getName());
            System.out.println("Salary: "+e.calculate_salary());
        }
    }


}
