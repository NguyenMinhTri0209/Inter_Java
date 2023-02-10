package FinalExercise.Employee_brand3.thread;

import FinalExercise.Employee_brand3.model.Employee;
import FinalExercise.Employee_brand3.model.Manager;

import java.util.List;

public class ReadFile implements Runnable{

    List<Employee> employeeList;

    public ReadFile(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Manager manager = new Manager();
        manager.viewSalaryTable(employeeList);
    }
}
