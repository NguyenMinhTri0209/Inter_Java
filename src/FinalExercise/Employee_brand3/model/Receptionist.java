package FinalExercise.Employee_brand3.model;

public class Receptionist extends Employee{

    //region constructor
    public Receptionist(String id, String name, byte working_hours, long out_time) {
        super(id, name, working_hours, out_time);
    }

    public Receptionist() {
    }

    //endregion

    @Override
    public long calculate_salary() {
        return super.calculate_salary();
    }
}
