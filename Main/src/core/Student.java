package core;

public class Student {
    private String studentCode;
    private String fullName;
    private byte age;
    private String gender;
    private String phoneNumber;
    private String email;

    public Student() {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void StringFormat(){
        System.out.printf("%-15s %-15s %15s %15s %15s %15s %n", "Id", "Name", "Age", "Gender", "PhoneNumber", "Email");
    }

    public void Display(){
        System.out.printf("%-15s %-15s %15d %15s %15s %15s %n", this.studentCode, this.fullName, this.age, this.gender, this.phoneNumber, this.email);
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Student setStudentCode(String studentCode) {
        this.studentCode = studentCode;
        return this;
    }

    public Student setAge(byte age) {
        this.age = age;
        return this;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public byte getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }
}
