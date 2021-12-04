package pl.jacaosom.employeestime;

import java.util.*;

public class Employee {

    protected String firstName;
    protected String lastName;
    //private String contractType;
    protected int age;
    protected int phoneNumber;


    public Employee(){
    }

    public Employee(String firstName, String lastName, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getContractType() {
//        return contractType;
//    }
//
//    public void setContractType(String contractType) {
//        this.contractType = contractType;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void displayEmployeeInformation(){
        System.out.println("\nFirst name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
    }
}
