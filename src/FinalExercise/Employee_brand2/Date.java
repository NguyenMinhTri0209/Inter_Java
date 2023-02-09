package FinalExercise.Employee_brand2;

import java.util.Scanner;

public class Date {
    protected int day, month, year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day: ");
        this.day = scanner.nextInt();
        System.out.println("Month: ");
        this.month = scanner.nextInt();
        System.out.println("Year: ");
        this.year = scanner.nextInt();
    }

    public void output(){
        System.out.println("Day: "+this.day+"/"+this.month+"/"+this.year);
    }

}
