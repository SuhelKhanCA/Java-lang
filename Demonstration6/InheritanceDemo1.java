package Demonstration6;

import java.util.Date;

class Person{
    String name;
    int dob;
    int mobileNo;
    void readData(String n, Date d, int m){
        name = n;
        dob = d;
        mobileNo = m;
    }
    void printData(){
        System.out.println("Name: " + name);
        // dob.getDate();
        // dob.
        System.out.println("DoB : "+ dob);
        System.out.println("Mobile : " + mobileNo);
    }
}
class Student extends Person{
    String instituition;
    int rollNo;
    int[] qualif = new int[20];
    int[] marks = new int[5];

    void printBioData(){
        printData();
        System.out.println("Instituition : " + instituition);
        System.out.println("Roll : " + rollNo);

        for (int i = 0; i < qualif.length; i++) {
            System.out.println("Qualification: " + i + qualif[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks: " + i + marks[i]);
        }
    }
}

class Employee extends Person{
    int empNo;
    int[] salaryHistory = new int[12];
    String organization;
    String designation;
    Date doj;

    void printSalary(){
        for (int i = 0; i < salaryHistory.length; i++) {
            System.out.println("Salary: " + i+ ": " + salaryHistory[i]);
        }
    }
}
public class InheritanceDemo1 {
    public static void main(String[] args) {
        Person p = new Person();
        // code with object p...
        // int dt = 2001-08-23;
        p.readData("Suhel", null, 969);
        p.printData();
        Student s = new Student();
        // code with objects s...
        System.out.println(s.dob = 2001-05-17);
        Employee e = new Employee();
        // code with the objects e...
    }
}
