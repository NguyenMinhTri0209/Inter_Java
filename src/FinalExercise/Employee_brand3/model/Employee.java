package FinalExercise.Employee_brand3.model;

import FinalExercise.Wage;

public class Employee implements EmployeeRule{
    String id;
    String name;
    byte working_hours;
    long out_time;

    //region constructor & getter/setter
    public Employee() {
    }

    public Employee(String id, String name, byte working_hours, long out_time) {
        this.id = id;
        this.name = name;
        this.working_hours = working_hours;
        this.out_time = out_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(byte working_hours) {
        this.working_hours = working_hours;
    }

    public long getOut_time() {
        return out_time;
    }

    public void setOut_time(long out_time) {
        this.out_time = out_time;
    }

    //endregion

    @Override
    public long calculate_salary(){
        long salary_per_day;
        String id = getId().substring(0,2);
        switch (id) {
            case "AC":
                salary_per_day = Wage.Accountant.getValue();
                break;
            case "EN","EP":
                salary_per_day = Wage.Engineer.getValue();
                break;
            case "CL":
                salary_per_day = Wage.Housekeeper.getValue();
                break;
            case "MN":
                salary_per_day = Wage.Manager.getValue();
                break;
            case "RE":
                salary_per_day = Wage.Receptionist.getValue();
                break;
            default:
                System.out.println("Error");
                salary_per_day = 0;
                break;
        }
        return (working_hours * salary_per_day) + (out_time * 300000);
    }
}
