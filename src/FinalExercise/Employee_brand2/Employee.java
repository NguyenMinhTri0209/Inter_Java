package FinalExercise.Employee_brand2;

import FinalExercise.Wage;

import java.util.*;

public class Employee extends Person implements CheckSalary {
    String id;
    String department;
    String role;
    String englishProficiency;
    String degree;
    FinalExercise.Employee_brand2.Date startDay;
    byte dayOfWork;
    byte outTime;

    public Employee() {
    }

    public Employee(String name, boolean sex, Date birthday, String address, String phone, String email, String identification, String religion, boolean marriage, String id, String department, String role, String englishProficiency, String degree, Date startDay, byte dayOfWork, byte outTime) {
        super(name, sex, birthday, address, phone, email, identification, religion, marriage);
        this.id = id;
        this.department = department;
        this.role = role;
        this.englishProficiency = englishProficiency;
        this.degree = degree;
        this.startDay = startDay;
        this.dayOfWork = dayOfWork;
        this.outTime = outTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEnglishProficiency() {
        return englishProficiency;
    }

    public void setEnglishProficiency(String englishProficiency) {
        this.englishProficiency = englishProficiency;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public byte getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(byte dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public byte getOutTime() {
        return outTime;
    }

    public void setOutTime(byte outTime) {
        this.outTime = outTime;
    }

    // C??u 2 T??nh l????ng
    public long salary() {
        switch (role) {
            case "Accountant":
                return dayOfWork * Wage.Accountant.getValue() + this.outTime*300000;
            case "Engineer":
                return dayOfWork * Wage.Engineer.getValue() + this.outTime*300000;
            case "Housekeeper":
                return dayOfWork * Wage.Housekeeper.getValue() + this.outTime*300000;
            case "Manager":
                return dayOfWork * Wage.Manager.getValue() + this.outTime*300000;
            case "Receptionist":
                return dayOfWork * Wage.Receptionist.getValue() + this.outTime*300000;
            default:
                return 0;
        }
    }


    // C??u 3: Ph????ng th???c xem b???ng l????ng
//    public void viewTableSalary(List<Employee> employeeList){
//        if (role.compareTo("Manager") == 1 || role.compareTo("Accountant") == 1){
//            for (Employee e : employeeList){
//                System.out.println("Name: "+e.getName());
//                System.out.println("Salary: "+e.salary());
//            }
//        }
//        else
//            System.out.println("Only manager or accountant have permission to view table salary");
//    }

    // C??u 4: ????a ra ng?????i c?? m???c l????ng cao nh???t
//    public void viewSrotTableSalary(List<Employee> employeeList){
//        if (role.compareTo("Manager") == 1){
//            Map<Employee, Long> map = new HashMap<Employee, Long>();
////            Set<Employee> set = map.keySet();
//            for (Employee e : employeeList){
//                if (e.getRole().compareTo("Manager")==1)
//                    continue;
//                else {
//                    map.put(e, e.salary());
//                }
//            }
//
//            //s???p x???p v?? tr??? v??? ?????i t?????ng ?????ng ?????u
//            //s???p x???p theo value
//
//        }
//        else
//            System.out.println("Only manager or accountant have permission to use that");
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", englishProficiency='" + englishProficiency + '\'' +
                ", degree='" + degree + '\'' +
                ", startDay=" + startDay.day + "/" + startDay.month + "/" + startDay.year +
                ", dayOfWork=" + dayOfWork +
                ",outTime="+outTime+
                ", name='" + name + '\'' +
                ", Sex=" + Sex +
                ", birthday=" + birthday.day + "/" + birthday.month + "/" + birthday.year +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", religion='" + religion + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
