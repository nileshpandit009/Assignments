package com.company.cdac.cop3;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeRunner {
    private ArrayList<Employee> employees;

    public EmployeeRunner() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        EmployeeRunner employeeRunner = new EmployeeRunner();
        employeeRunner.initializer();

        System.out.println("Name\t\tYear of joining\t\tAddress\t\t\tSalary");
        for (Employee employee : employeeRunner.getEmployees()) {
            System.out.println(employee.getName() +
                    "\t\t" + employee.getDateOfJoining().getYear() +
                    "\t\t\t" + employee.getAddress().getHouseNo() + "-" + employee.getAddress().getStreetName() +
                    "\t\t" + employee.getSalary());
        }
    }

    private void initializer() {
        this.addEmployee(
                new Employee(
                        "Robert",
                        LocalDate.of(1994, 4, 21),
                        40000.00,
                        new Address("64C", "WallStreet", "NYC", "New York", "USA"))
        );

        this.addEmployee(
                new Employee(
                        "Sam ",
                        LocalDate.of(2000, 8, 2),
                        35000.00,
                        new Address("68D", "WallStreet", "NYC", "New York", "USA"))
        );

        this.addEmployee(
                new Employee(
                        "John",
                        LocalDate.of(1999, 1, 25),
                        50000.00,
                        new Address("26B", "WallStreet", "NYC", "New York", "USA"))
        );
    }
}
