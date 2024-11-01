package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();

    public void AddStudent() {
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
                sc.nextLine();
            System.out.println("Enter student code: ");
                String StudentCodeT = sc.nextLine();
            System.out.println("Enter student name: ");
                String fullNameT = sc.nextLine();
            System.out.println("Enter student age: ");
                int ageT = sc.nextByte();
            System.out.println("Enter student gender: ");
                sc.nextLine();
                String genderT = sc.nextLine();
            System.out.println("Enter student phone number: ");
                String phoneNumberT = sc.nextLine();
            System.out.println("Enter student email: ");
                String emailT = sc.nextLine();

            students.add(new Student());
            students.get(i).setStudentCode(StudentCodeT).setFullName(fullNameT).setAge((byte) ageT).setGender(genderT).setPhoneNumber(phoneNumberT).setEmail(emailT);

        }
    }

    public void ShowStudents() {
        Student.StringFormat();
        for(int i = 0; i < students.size(); i++) {
           students.get(i).Display();
        }
    }

    public static void main(String[] args) {
       Main main = new Main();

       int n=0;
       do {
           System.out.println("1. Add Student");
           System.out.println("2. Show Students");
           System.out.println("3. Exit");
           System.out.println("Enter your choice: ");
           n = sc.nextInt();
           switch (n) {
               case 2:
                   main.ShowStudents();
                   break;
               case 1:
                   main.AddStudent();
                   break;
           }
       } while (n != 3);

    }
}
