package FinalExercise.Employee_brand3.thread;

import FinalExercise.Employee_brand3.model.Employee;
import FinalExercise.Employee_brand3.model.Manager;

import java.util.List;

public class InsertFile implements Runnable{

    String path;
    List<Employee> employeeList;

    public InsertFile(String path, List<Employee> employeeList) {
        this.path = path;
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
        manager.insertFile(path,employeeList);
    }
}
