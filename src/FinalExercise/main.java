package FinalExercise;


import FinalExercise.Employee_brand2.Accountant;
import FinalExercise.Employee_brand2.Date;
import FinalExercise.Employee_brand2.Employee;
import FinalExercise.Employee_brand2.Manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Nguyễn Minh Tú", true, new FinalExercise.Employee_brand2.Date(2,9,2001),"Van Phu", "0905011037", "Minhtriarch84@gmail.com",
                "225626689", "Phật Giáo", false, "61133202", "IT", "Engineer", "B1.2", "DHNT", new Date(2,12,2022), (byte) 12);
        Accountant e2 = new Accountant("Nguyễn Tài", true, new FinalExercise.Employee_brand2.Date(10,8,2000),"Van Phu", "0905011037", "Toan7@gmail.com",
                "224512212", " ", false, "58525211", "Hành chính", "Accountant", "B1.2", "DHTPHCM", new Date(2,12,2022), (byte) 14);
        Manager e3 = new Manager("Nguyễn Hải", true, new Date(12,2,2001),"Van Phu", "0986421354", "Haiarch84@gmail.com",
                "222123122", " ", false, "82584125", "Quản trị", "Manager", "B1.2", "DHNT", new Date(2,12,2022), (byte) 5);
        Employee e4 = new Employee("Nguyễn Minh Trung", true, new FinalExercise.Employee_brand2.Date(25,4,2001),"Van Phu", "0956322332", "Bee@gmail.com",
                "287551215", "Thiên Chúa", false, "65125874", "Phục vụ", "Housekeeper", "B1.2", "DHQN", new Date(2,12,2022), (byte) 24);
        Employee e5 = new Employee("Nguyễn Minh", true, new FinalExercise.Employee_brand2.Date(2,8,2001),"Van Phu", "0905632236", "NQC@gmail.com",
                "244651322", "Ki-tô Giáo", false, "52354254", "Hành chính", "Receptionist", "B1.2", "DHQG", new Date(2,12,2022), (byte) 30);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));

        //1 Check salary all employee
        System.out.println(e1.getName()+": "+e1.salary()+" VND");
        System.out.println(e2.getName()+": "+e2.salary()+" VND");
        System.out.println(e3.getName()+": "+e3.salary()+" VND");
        System.out.println(e4.getName()+": "+e4.salary()+" VND");
        System.out.println(e5.getName()+": "+e5.salary()+" VND");

        //2 View salary table
        System.out.println("===================================");
        System.out.println("View salary table");
        e3.viewTableSalary(employeeList);
//        e2.viewTableSalary(employees);

        //3 The salary highest
        System.out.println("===================================");
        System.out.println("The salary highest");
        e3.viewHightestSalary(employeeList);

        //4 Read file .txt
        System.out.println("===================================");
        System.out.println("Read and output file");
        String url = "C:\\Users\\Minht\\Downloads\\data.txt";
        File file = new File(url);
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine())!= null) {
                String [] data = line.split(",");
                Employee employee = new Employee();
                employee.setName(data[0]);
                employee.setSex(Boolean.parseBoolean(data[1]));
                employee.setBirthday(new Date(Byte.parseByte(data[2]),Byte.parseByte(data[3]),Byte.parseByte(data[4])));
                employee.setAddress(data[5]);
                employee.setPhone(data[6]);
                employee.setEmail(data[7]);
                employee.setIdentification(data[8]);
                employee.setReligion(data[9]);
                employee.setMarriage(Boolean.parseBoolean(data[10]));
                employee.setId(data[11]);
                employee.setDepartment(data[12]);
                employee.setRole(data[13]);
                employee.setEnglishProficiency(data[14]);
                employee.setDegree(data[15]);
                employee.setStartDay(new Date(Byte.parseByte(data[16]),Byte.parseByte(data[17]),Byte.parseByte(data[18])));
                employee.setDayOfWork(Byte.parseByte(data[19]));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Employee e: employeeList){
            System.out.println(e.toString());
        }
    }
}
