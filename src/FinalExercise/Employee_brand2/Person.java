package FinalExercise.Employee_brand2;

public class Person {
    String name;
    boolean Sex;
    FinalExercise.Employee_brand2.Date birthday;
    String address;
    String phone;
    String email;
    String identification;
    String religion;
    boolean marriage;

    public Person() {
    }

    public Person(String name, boolean sex, Date birthday, String address, String phone, String email, String identification, String religion, boolean marriage) {
        this.name = name;
        Sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.identification = identification;
        this.religion = religion;
        this.marriage = marriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }


}
