package pl.jacaosom.employeestime;

import java.util.*;

public class EmployeeTasks extends Employee{
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Employee> employeeStringMap = new HashMap<>();
    boolean isInputCorrect = false;

    private String addFirstName(){
        System.out.print("Enter employee's first name: ");
        firstName = scanner.next();

        return firstName;
    }

    private  String addLastName(){
        System.out.print("Enter employee's last name: ");
        lastName = scanner.next();

        return lastName;
    }

    private int addAge(){
        do{
            try{
                System.out.print("Enter employee's age: ");
                age = scanner.nextInt();
                if (age < 18){
                    System.out.println("The employee must be over 18 years old!");
                }
                else {
                    isInputCorrect = true;
                }
            }
            catch(InputMismatchException inputMismatchException){
                System.out.println("Invalid data! Please enter correct value.");
                scanner.nextLine();
            }

        }while(!isInputCorrect);
        return age;
    }
    private int addPhoneNumber(){
        do{
            try{
                System.out.print("Enter employee's phone number: ");
                phoneNumber = scanner.nextInt();
                if (phoneNumber < 100000000){
                    System.out.println("Phone number has got at least 9 chars");
                }
                else {
                    isInputCorrect = true;
                }
            }
            catch(InputMismatchException inputMismatchException){
                System.out.println("Invalid data! Please enter correct value.");
                scanner.nextLine();
            }
        }while(!isInputCorrect);
        return phoneNumber;
    }

    public void addEmployee(){
        addFirstName();
        addLastName();
        addAge();
        addPhoneNumber();
        System.out.println();

        Employee employee = new Employee(firstName, lastName, age, phoneNumber);

        employees.add(employee);
        employeeStringMap.put(lastName, employee);
    }

    public void displayEmployees(){
        int i = 1;
        for (Employee employee: employees) {
            System.out.print("Employee " + i++);
            employee.displayEmployeeInformation();
            System.out.println();
        }
    }

    public void displayEmployeeByLastName(){
        System.out.print("\nEnter employee's last name: ");
        lastName = scanner.next();

        Employee employee = employeeStringMap.get(lastName);
        System.out.print("\nEmployee searched by last name:");
        employee.displayEmployeeInformation();
        System.out.println();
    }

    public void Start(){

        int userChoice = 0;
        boolean isInputCorrect = true;
        do {
            System.out.println("Select your task:");
            System.out.println("1 - Add employee.");
            System.out.println("2 - Display all employees.");
            System.out.println("3 - Display employee by last name.");
            System.out.println("4 - Add employee's contract type.");
            System.out.println("5 - Save list of employees to file.");
            System.out.println("0 - Exit.");
            System.out.print("Type here: ");
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 1 -> addEmployee();
                case 2 -> displayEmployees();
                case 3 -> displayEmployeeByLastName();
//                case 4 ->
                case 0 -> {
                    System.out.println("Program will shutdown.");
                    isInputCorrect = false;
                }

            }

        }while(isInputCorrect);
    }


}
