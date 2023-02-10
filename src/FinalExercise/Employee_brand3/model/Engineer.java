package FinalExercise.Employee_brand3.model;

public class Engineer extends Employee{
    String role;

    //region constructor
    public Engineer(String id, String name, byte working_hours, long out_time, String role) {
        super(id, name, working_hours, out_time);
        this.role = role;
    }

    public Engineer() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //endregion

    @Override
    public long calculate_salary() {
        return super.calculate_salary();
    }
}
