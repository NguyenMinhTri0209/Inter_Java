package FinalExercise.Employee_brand3;

public enum Wage {
    Accountant(500000), Engineer(800000), Housekeeper(300000), Manager(1500000), Receptionist(350000);

    private int value;

    private Wage(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
