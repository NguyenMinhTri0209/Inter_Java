package FinalExercise.Employee_brand3;

import FinalExercise.Employee_brand3.model.*;
import FinalExercise.Employee_brand3.thread.InsertFile;
import FinalExercise.Employee_brand3.thread.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Manager manager = new Manager("MN000","Phạm Nhật Vượng",(byte)40,5);
        Accountant accountant = new Accountant("AC000","Nguyễn Phúc Anh Thi",(byte)40,2);
        Receptionist receptionist = new Receptionist("RE000","Nguyễn Phạm Anh Trúc",(byte)40,0);
        Cleaner cleaner = new Cleaner("CL000","Nguyễn Phú",(byte)40,10);
        Engineer engineerS = new Engineer("EP000","Nguyễn Trí Minh",(byte)40,20,"Software Engineer");
        Engineer engineerN = new Engineer("EN000","Nguyễn Ngọc Trình",(byte)40,20,"Network Engineer");

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(manager,accountant,receptionist,cleaner,engineerS,engineerN));

        //e1: view person's salary per month
        System.out.println("================================================");
        for (Employee e : employeeList){
            System.out.println("Name: "+e.getName()+" __ Salary: "+e.calculate_salary()+" VND");
        }

        //e2: view salary table
        System.out.println("================================================");
        manager.viewSalaryTable(employeeList);
//        accountant.viewSalaryTable(employeeList);

        //e3: view the highest salary
        System.out.println("================================================");
        manager.viewHighestSalary(employeeList);

        //e4: insert data from file.txt
        System.out.println("================================================");
        String path = "C:\\Users\\Minht\\Downloads\\file.txt";
//        manager.insertFile(path,employeeList);

        //ex Thread
        System.out.println("==============READ FILE BY THREAD===============");

        InsertFile runInsert = new InsertFile(path,employeeList);
        Thread threadInsert = new Thread(runInsert);

        ReadFile runRead = new ReadFile(employeeList);
        Thread threadRead = new Thread(runRead);

        threadInsert.start();
        threadInsert.join();

        threadRead.start();

    }
}
