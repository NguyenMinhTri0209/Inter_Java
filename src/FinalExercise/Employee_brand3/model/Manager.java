package FinalExercise.Employee_brand3.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class Manager extends Employee{

    //region constructor
    public Manager(String id, String name, byte working_hours, long out_time) {
        super(id, name, working_hours, out_time);
    }

    public Manager() {
    }

    //endregion

    @Override
    public long calculate_salary() {
        return super.calculate_salary();
    }

    //view salary table
    public void viewSalaryTable(List<Employee> employeeList){
        System.out.println("==================SALARY TABLE==================");
        for (Employee e : employeeList){
            System.out.println("Name: "+e.getName());
            System.out.println("Salary: "+e.calculate_salary());
        }
    }

    //view the highest salary
    public void viewHighestSalary(List<Employee> employeeList){
        long highestSalary = 0;
        for (Employee e : employeeList){
            if (e instanceof Manager){
                continue;
            }
            else {
                if (highestSalary < e.calculate_salary()){
                    highestSalary = e.calculate_salary();
                }
            }
        }
        // more than two people
        for (Employee e : employeeList){
            if (highestSalary == e.calculate_salary()){
                System.out.println("Name: "+e.getName());
                System.out.println("Salary: "+e.calculate_salary());
            }
        }
    }

    //insert file.txt
    public void insertFile(String path, List<Employee> employeeList){
        System.out.println("Read and output file");
        File file = new File(path);
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine())!= null) {
                String [] data = line.split(",");
                Engineer engineer = new Engineer();
                engineer.setId(data[0]);
                engineer.setName(data[1]);
                engineer.setWorking_hours(Byte.parseByte(data[2]));
                engineer.setOut_time(Long.parseLong(data[3]));
                engineer.setRole(data[4]);
                employeeList.add(engineer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
